import java.util.InputMismatchException;
import java.util.Scanner;

import clases.ControladorDePregutas;
import clases.Jugador;
import utilities.*;

public class App {
    public static void main(String[] args) {
        /**
         * instacia del logger para mostrar datos
         */
        MessagesWithJboss message = new MessagesWithJboss();

        /**
         * instanciamos el scanner para recibir los datos introducidos por consola
         */
        Scanner read = new Scanner(System.in);

        /**
         * instanciamos la clase que nos permite utilizar el metodo de agregar preguntas
         */
        AgregarPreguntas preguntasArray = new AgregarPreguntas();

        /**
         * declaramos la variable global rondaActual para llevar el control de la ronda
         * del juego
         */
        Integer rondaActual = 1;

        /**
         * instaciamos la clase controlador de preguntas que nos permite utilizar los
         * metodos necesarios
         * para mostrar las preguntas y su respectivas respuestas
         */
        ControladorDePregutas control = new ControladorDePregutas();

        /**
         * le envia el array de preguntas a control
         */
        control.agregarPreguntas(preguntasArray.agregarTodasLasPreguntas());

        /**
         * instanciamos la clase generador aleatorio para generar un numero aleatorio
         * que será
         * utilizado para variar las forma en que se muestran las preguntas
         */
        GeneradorAleatorio aleatorio = new GeneradorAleatorio();

        /**
         * esta variable global se usa para guardar el nombre del jugador una vez haya o
         * se hay retirado
         */
        String nombreJugador;

        /**
         * variable booleana que permite controlar la terminación del ciclo
         */
        Boolean salir = false;

        /**
         * variable global para controlar el puntaje del juego durante la partida
         */
        Integer puntajeJuego = 0;

        while (!salir) {
            Integer formaMostrar = aleatorio.integerAleatorio(1, 4);
            control.setFormaMostrar(formaMostrar);
            control.mostrarPreguntas();
            message.printMessage("opcion 0: para salir");
            try {
                message.printMessage("\nEscoja una opcion: ");
                int opciones = read.nextInt();

                /**
                 * En caso de que el usuario ingrese cero, se terminará el juego y se guardaran
                 * los datos del jugador.
                 * con el puntaje acumulado hasta ese momento
                 * En caso de que ingrese una opcion entre 1 y 4 se verifica si la respuesta
                 * elegida es correcta si es así se aumenta su puntaje y el numero de la ronda.
                 * Si es incorrecta se finaliza el juego y se termina la ejecucion del programa.
                 */
                if (opciones == 0) {
                    message.printMessage("salió, ganaste:" + puntajeJuego+"" +
                            "\nIngrese su nombre:");
                    nombreJugador = read.next();
                    finalizarJuego(puntajeJuego, nombreJugador);
                    salir = true;
                } else if (opciones == control.getFormaMostrar()) {
                    message.printMessage("Correcto");
                    puntajeJuego = puntajeJuego + 400 * rondaActual;
                    rondaActual += 1;
                    control.setRondaJuego(rondaActual);
                } else {
                    message.printMessage("Incorrecto");
                    read.close();
                    salir = true;
                }

                /**
                 * condicional para detectar que el jugador ha ganado
                 */
                if (rondaActual > 5) {
                    message.printMessage(" ganaste:" + puntajeJuego+"" +
                            "\nIngrese su nombre:");
                    nombreJugador = read.next();
                    finalizarJuego(puntajeJuego, nombreJugador);
                    salir = true;
                }

            } catch (InputMismatchException e) {
                message.printMessage("ingrese una opcion valida");
                read.next();
            }

        }
    }

    /**
     * este metodo se llama una vez se haya finalizado el juego de manera voluntario
     * o por haber ganado
     * 
     * @param puntaje
     * @param nombre
     */
    public static void finalizarJuego(Integer puntaje, String nombre) {
        ConectionToSQL con = new ConectionToSQL();
        con.connectionSql();
        DbOperaciones operacion = new DbOperaciones();
        Jugador jugador = new Jugador(nombre, puntaje);
        operacion.saveJugador(jugador, con);
    }
}

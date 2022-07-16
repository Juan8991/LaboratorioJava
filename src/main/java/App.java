import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import clases.ControladorDePregutas;
import clases.Jugador;
import clases.Pregunta;
import utilities.*;

public class App {
    public static void main(String[] args) {
        MessagesWithJboss message = new MessagesWithJboss();

        Scanner read = new Scanner(System.in);
        // System.out.println(numero);
        // System.out.println(numero);
        // ConectionToSQL con= new ConectionToSQL();
        // con.connectionSql();
        AgregarPreguntas qwerty = new AgregarPreguntas();
        Integer rondaActual = 1, opcion;
        // qwerty.agregarTodasLasPreguntas();
        // ArrayList<Pregunta> preguntas = qwerty.agregarTodasLasPreguntas();
        // String pregunta=preguntas.get(5).toString();

        ControladorDePregutas control = new ControladorDePregutas();
        control.agregarPreguntas(qwerty.agregarTodasLasPreguntas());
        // Integer formaI = control.getFormaMostrar();
        // rondaActual = control.getRondaJuego();
        // String rCorrecta = control.mostrarPreguntas();

        // System.out.println(rCorrecta + " forma:" + formaI);
        // System.out.println("Ingrese su respuesta opciones validas (1,2,3,4)");
        // opcion = read.nextInt();
        // if (opcion == formaI) {
        //     System.out.println("Correcto");
        //     rondaActual += 1;
        //     control.setRondaJuego(rondaActual);
        //     control.mostrarPreguntas();
        // } else {
        //     System.out.println("Incorrecto");
        // }

        GeneradorAleatorio aleatorio = new GeneradorAleatorio();
        
        String nombreJugador;
        boolean salir = false;

        Scanner getData = new Scanner(System.in);

        Integer puntajeJuego = 0;

        while (!salir) {
            System.out.println("ronda actual: " + rondaActual);
            Integer formaMostrar=aleatorio.integerAleatorio(1,4);
            control.setFormaMostrar(formaMostrar);
            control.mostrarPreguntas();
            message.printMessage("opcion 0: para salir");
            try {
                System.out.print("\nEscoja una opcion: ");
                int opciones = getData.nextInt();

                if (opciones == 0) {
                    System.out.println("salió, ganaste:" +puntajeJuego);
                    // pido nombre
                    System.out.println("Ingrese su nombre:");
                    nombreJugador=read.nextLine();
                    finalizarJuego(puntajeJuego,nombreJugador);
                    salir = true;
                } else if (opciones == control.getFormaMostrar()) {
                    System.out.println("Correcto");
                    puntajeJuego = puntajeJuego + 400 * rondaActual;
                    rondaActual += 1;
                    control.setRondaJuego(rondaActual);
                } else {
                    System.out.println("Incorrecto");
                    salir = true;
                }

                if(rondaActual >5 ){
                    System.out.println("ganaste: "+puntajeJuego );
                    System.out.println("Ingrese su nombre:");
                    nombreJugador=read.nextLine();
                    finalizarJuego(puntajeJuego,nombreJugador);

                    salir = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("ingrese una opcion valida");
                getData.next();
            }

        }
    }

    public static void finalizarJuego(Integer puntaje, String nombre) {
        ConectionToSQL con= new ConectionToSQL();
        con.connectionSql();
        DbOperaciones operacion=new DbOperaciones();
        Jugador jugador= new Jugador(nombre,puntaje);
        operacion.saveJugador(jugador,con);
        // hago un insert de nombre con el puntaje 
        // guardar puntos en la db
    }
}

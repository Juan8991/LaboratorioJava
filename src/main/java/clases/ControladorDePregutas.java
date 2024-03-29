package clases;

import java.util.ArrayList;

import utilities.GeneradorAleatorio;
import utilities.MessagesWithJboss;

public class ControladorDePregutas {
    MessagesWithJboss message = new MessagesWithJboss();

    GeneradorAleatorio aleatorio = new GeneradorAleatorio();
    private Integer formaMostrar;
    /**
     * Debido a que el array esta lleno y organizado con objetos tipo Pregunta por
     * nivel de dificultad. De la posicion cero a la tres
     * se encuentra la dificultad numero uno y así sucesivamente,
     */
    Integer numeroAleatorio = aleatorio.integerAleatorio(0, 3); // dificultad 1
    Integer numeroAleatorio1 = aleatorio.integerAleatorio(4, 7); // dificultad 2
    Integer numeroAleatorio2 = aleatorio.integerAleatorio(8, 11); // dificultad 3
    Integer numeroAleatorio3 = aleatorio.integerAleatorio(12, 15); // dificultad 4
    Integer numeroAleatorio4 = aleatorio.integerAleatorio(16, 19); // dificultad 5

    private Integer rondaJuego = 1;
    ArrayList<Pregunta> arrayPreguntas = new ArrayList<Pregunta>();

    public ControladorDePregutas() {
        // TODO document why this constructor is empty
    }

    /**
     * Este metodo permite agregar el Array que contiene todas las preguntas al
     * Array de la
     * clase para que pueda ser manipulada por sus metodos.
     * 
     * @param {Array con todas las preguntas que se van a utilizar en el juego}
     *               array
     */
    public void agregarPreguntas(ArrayList todasLasPreguntas) {
        this.arrayPreguntas = todasLasPreguntas;
    }

    String respuesta1;

    /**
     * El metodo mostrarPreguntas utiliza el array de todas las preguntas y la ronda
     * actual del juego
     * para realizar la logica de como se van a mostrar las preguntas.
     */
    public String mostrarPreguntas() {
        String pregunta;
        String categoria;
        String respuesta2;
        String respuesta3;
        String respuesta4;

        if (this.rondaJuego == 1) {
            /**
             * Estas variables permiten almacener dentro del metodo
             * la pregunta, la categoria, la respuesta correcta y las 3 respuestas
             * incorrectas
             */
            pregunta = this.arrayPreguntas.get(numeroAleatorio).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio).incorrecta3;
            /**
             * de acuerdo al numero en formaMostrar será el orden en el que aparezcan las
             * respuestas y nos permite controlar en que posicion se muesta la respuesta
             * correcta
             */
            if (formaMostrar == 1) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta1
                        + "\nOpcion 2:" + respuesta2 + "\nOpcion 3:" + respuesta3 + "\nOpcion 4:" + respuesta4);
            } else if (formaMostrar == 2) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta2
                        + "\nOpcion 2:" + respuesta1 + "\nOpcion 3:" + respuesta4 + "\nOpcion 4:" + respuesta3);
            } else if (formaMostrar == 3) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta3
                        + "\nOpcion 2:" + respuesta4 + "\nOpcion 3:" + respuesta1 + "\nOpcion 4:" + respuesta2);
            } else if (formaMostrar == 4) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta4
                        + "\nOpcion 2:" + respuesta3 + "\nOpcion 3:" + respuesta2 + "\nOpcion 4:" + respuesta1);
            }

        } else if (this.rondaJuego == 2) {
            pregunta = this.arrayPreguntas.get(numeroAleatorio1).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio1).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio1).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta3;
            if (formaMostrar == 1) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta1
                        + "\nOpcion 2:" + respuesta2 + "\nOpcion 3:" + respuesta3 + "\nOpcion 4:" + respuesta4);
            } else if (formaMostrar == 2) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta2
                        + "\nOpcion 2:" + respuesta1 + "\nOpcion 3:" + respuesta4 + "\nOpcion 4:" + respuesta3);
            } else if (formaMostrar == 3) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta3
                        + "\nOpcion 2:" + respuesta4 + "\nOpcion 3:" + respuesta1 + "\nOpcion 4:" + respuesta2);
            } else if (formaMostrar == 4) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta4
                        + "\nOpcion 2:" + respuesta3 + "\nOpcion 3:" + respuesta2 + "\nOpcion 4:" + respuesta1);
            }

        } else if (this.rondaJuego == 3) {
            pregunta = this.arrayPreguntas.get(numeroAleatorio2).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio2).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio2).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta3;
            if (formaMostrar == 1) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta1
                        + "\nOpcion 2:" + respuesta2 + "\nOpcion 3:" + respuesta3 + "\nOpcion 4:" + respuesta4);
            } else if (formaMostrar == 2) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta2
                        + "\nOpcion 2:" + respuesta1 + "\nOpcion 3:" + respuesta4 + "\nOpcion 4:" + respuesta3);
            } else if (formaMostrar == 3) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta3
                        + "\nOpcion 2:" + respuesta4 + "\nOpcion 3:" + respuesta1 + "\nOpcion 4:" + respuesta2);
            } else if (formaMostrar == 4) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta4
                        + "\nOpcion 2:" + respuesta3 + "\nOpcion 3:" + respuesta2 + "\nOpcion 4:" + respuesta1);
            }

        } else if (this.rondaJuego == 4) {
            pregunta = this.arrayPreguntas.get(numeroAleatorio3).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio3).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio3).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta3;
            if (formaMostrar == 1) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta1
                        + "\nOpcion 2:" + respuesta2 + "\nOpcion 3:" + respuesta3 + "\nOpcion 4:" + respuesta4);
            } else if (formaMostrar == 2) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta2
                        + "\nOpcion 2:" + respuesta1 + "\nOpcion 3:" + respuesta4 + "\nOpcion 4:" + respuesta3);
            } else if (formaMostrar == 3) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta3
                        + "\nOpcion 2:" + respuesta4 + "\nOpcion 3:" + respuesta1 + "\nOpcion 4:" + respuesta2);
            } else if (formaMostrar == 4) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta4
                        + "\nOpcion 2:" + respuesta3 + "\nOpcion 3:" + respuesta2 + "\nOpcion 4:" + respuesta1);
            }

        } else if (this.rondaJuego == 5) {
            pregunta = this.arrayPreguntas.get(numeroAleatorio4).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio4).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio4).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta3;
            if (formaMostrar == 1) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta1
                        + "\nOpcion 2:" + respuesta2 + "\nOpcion 3:" + respuesta3 + "\nOpcion 4:" + respuesta4);
            } else if (formaMostrar == 2) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta2
                        + "\nOpcion 2:" + respuesta1 + "\nOpcion 3:" + respuesta4 + "\nOpcion 4:" + respuesta3);
            } else if (formaMostrar == 3) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta3
                        + "\nOpcion 2:" + respuesta4 + "\nOpcion 3:" + respuesta1 + "\nOpcion 4:" + respuesta2);
            } else if (formaMostrar == 4) {
                message.printMessage(">" + pregunta + "\nCategoria:" + categoria + "\nOpcion 1:" + respuesta4
                        + "\nOpcion 2:" + respuesta3 + "\nOpcion 3:" + respuesta2 + "\nOpcion 4:" + respuesta1);
            }

        }
        return respuesta1;

    }

    /**
     * Este metodo permite actualizar la ronda en la que se encuentra el juego para
     * luego ser utilizada.
     * 
     * @param {La ronda actual en la que se encuentra el juego} ronda
     */
    public void setRondaJuego(Integer rondaJuego) {
        this.rondaJuego = rondaJuego;
    }

    /**
     * este metodo es usado para que cambie el orden en el que se muestran las
     * respuestas
     * 
     * @param formaMostrar
     */
    public void setFormaMostrar(Integer formaMostrar) {
        this.formaMostrar = formaMostrar;
    }

    /**
     * Este metodo nos permite obtener el orden en el que se muestran las respuestas
     * y de acuerdo al orden podemos comparar la respuesta correcta
     * 
     * @return
     */
    public Integer getFormaMostrar() {
        return formaMostrar;
    }

}

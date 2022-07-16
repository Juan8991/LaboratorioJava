package clases;

import java.util.ArrayList;

import utilities.AgregarPreguntas;
import utilities.MessagesWithJboss;

public class ControladorDePregutas {
    MessagesWithJboss message = new MessagesWithJboss();

    AgregarPreguntas aleatorio = new AgregarPreguntas();
    Integer numeroAleatorio = aleatorio.aleatorio(0,5);
    Integer numeroAleatorio1 = aleatorio.aleatorio(5,10);
    Integer numeroAleatorio2 = aleatorio.aleatorio(10,15);
    Integer numeroAleatorio3 = aleatorio.aleatorio(15,20);
    Integer numeroAleatorio4 = aleatorio.aleatorio(20,25);

    private Integer rondaJuego = 1;
    ArrayList<Pregunta> arrayPreguntas = new ArrayList<Pregunta>();

    public ControladorDePregutas() {
    }

    public void agregarPreguntas(ArrayList todasLasPreguntas) {
        this.arrayPreguntas = todasLasPreguntas;
    }

    public void setrondaJuegoActual(Integer ronda) {
        this.rondaJuego = ronda;
    }

    String respuesta1;
    public String mostrarPreguntas(){
        String pregunta;
        String categoria;
        String respuesta2;
        String respuesta3;
        String respuesta4;

        if(this.rondaJuego==1){
            System.out.println(numeroAleatorio);
            pregunta = this.arrayPreguntas.get(numeroAleatorio).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio).incorrecta3;
            message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);

        }
        else if(this.rondaJuego==2){
            pregunta = this.arrayPreguntas.get(numeroAleatorio1).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio1).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio1).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta3;
            message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);

        }
        else if(this.rondaJuego==3){
            pregunta = this.arrayPreguntas.get(numeroAleatorio2).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio2).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio2).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta3;
            message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);


        }
        else if(this.rondaJuego==4){
            pregunta = this.arrayPreguntas.get(numeroAleatorio3).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio3).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio3).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta3;
            message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);


        }
        else if(this.rondaJuego==5){
            pregunta = this.arrayPreguntas.get(numeroAleatorio4).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio4).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio4).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta3;
            message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);

        }
        return respuesta1;

    }

}

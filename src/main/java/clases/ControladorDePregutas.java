package clases;

import java.util.ArrayList;

import utilities.AgregarPreguntas;
import utilities.GeneradorAleatorio;
import utilities.MessagesWithJboss;

public class ControladorDePregutas {
    MessagesWithJboss message = new MessagesWithJboss();

    GeneradorAleatorio aleatorio=new GeneradorAleatorio();
    private Integer formaMostrar;
    Integer numeroAleatorio = aleatorio.integerAleatorio(0,3);
    Integer numeroAleatorio1 = aleatorio.integerAleatorio(4,7);
    Integer numeroAleatorio2 = aleatorio.integerAleatorio(8,11);
    Integer numeroAleatorio3 = aleatorio.integerAleatorio(12,15);
    Integer numeroAleatorio4 = aleatorio.integerAleatorio(16,20);

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
            if(formaMostrar==1){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);
            }else if(formaMostrar==2){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta2+"\nOpcion 2:"+respuesta1+"\nOpcion 3:"+respuesta4+"\nOpcion 4:"+respuesta3);
            }else if(formaMostrar==3){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta3+"\nOpcion 2:"+respuesta4+"\nOpcion 3:"+respuesta1+"\nOpcion 4:"+respuesta2);
            }else if(formaMostrar==4){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta4+"\nOpcion 2:"+respuesta3+"\nOpcion 3:"+respuesta2+"\nOpcion 4:"+respuesta1);
            }

        }
        else if(this.rondaJuego==2){
            pregunta = this.arrayPreguntas.get(numeroAleatorio1).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio1).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio1).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio1).incorrecta3;
            if(formaMostrar==1){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);
            }else if(formaMostrar==2){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta2+"\nOpcion 2:"+respuesta1+"\nOpcion 3:"+respuesta4+"\nOpcion 4:"+respuesta3);
            }else if(formaMostrar==3){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta3+"\nOpcion 2:"+respuesta4+"\nOpcion 3:"+respuesta1+"\nOpcion 4:"+respuesta2);
            }else if(formaMostrar==4){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta4+"\nOpcion 2:"+respuesta3+"\nOpcion 3:"+respuesta2+"\nOpcion 4:"+respuesta1);
            }

        }
        else if(this.rondaJuego==3){
            pregunta = this.arrayPreguntas.get(numeroAleatorio2).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio2).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio2).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio2).incorrecta3;
            if(formaMostrar==1){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);
            }else if(formaMostrar==2){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta2+"\nOpcion 2:"+respuesta1+"\nOpcion 3:"+respuesta4+"\nOpcion 4:"+respuesta3);
            }else if(formaMostrar==3){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta3+"\nOpcion 2:"+respuesta4+"\nOpcion 3:"+respuesta1+"\nOpcion 4:"+respuesta2);
            }else if(formaMostrar==4){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta4+"\nOpcion 2:"+respuesta3+"\nOpcion 3:"+respuesta2+"\nOpcion 4:"+respuesta1);
            }


        }
        else if(this.rondaJuego==4){
            pregunta = this.arrayPreguntas.get(numeroAleatorio3).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio3).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio3).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio3).incorrecta3;
            if(formaMostrar==1){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);
            }else if(formaMostrar==2){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta2+"\nOpcion 2:"+respuesta1+"\nOpcion 3:"+respuesta4+"\nOpcion 4:"+respuesta3);
            }else if(formaMostrar==3){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta3+"\nOpcion 2:"+respuesta4+"\nOpcion 3:"+respuesta1+"\nOpcion 4:"+respuesta2);
            }else if(formaMostrar==4){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta4+"\nOpcion 2:"+respuesta3+"\nOpcion 3:"+respuesta2+"\nOpcion 4:"+respuesta1);
            }

        }
        else if(this.rondaJuego==5){
            pregunta = this.arrayPreguntas.get(numeroAleatorio4).pregunta;
            categoria = this.arrayPreguntas.get(numeroAleatorio4).categoria;
            respuesta1 = this.arrayPreguntas.get(numeroAleatorio4).rcorrecta;
            respuesta2 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta1;
            respuesta3 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta2;
            respuesta4 = this.arrayPreguntas.get(numeroAleatorio4).incorrecta3;
            if(formaMostrar==1){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta1+"\nOpcion 2:"+respuesta2+"\nOpcion 3:"+respuesta3+"\nOpcion 4:"+respuesta4);
            }else if(formaMostrar==2){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta2+"\nOpcion 2:"+respuesta1+"\nOpcion 3:"+respuesta4+"\nOpcion 4:"+respuesta3);
            }else if(formaMostrar==3){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta3+"\nOpcion 2:"+respuesta4+"\nOpcion 3:"+respuesta1+"\nOpcion 4:"+respuesta2);
            }else if(formaMostrar==4){
                message.printMessage(">"+pregunta+"\nCategoria:"+categoria+"\nOpcion 1:"+respuesta4+"\nOpcion 2:"+respuesta3+"\nOpcion 3:"+respuesta2+"\nOpcion 4:"+respuesta1);
            }

        }
        return respuesta1;

    }
    public void setRondaJuego(Integer rondaJuego) {
        this.rondaJuego = rondaJuego;
    }

    public Integer getRondaJuego() {
        return rondaJuego;
    }

    public void setFormaMostrar(Integer formaMostrar) {
        this.formaMostrar = formaMostrar;
    }
    public Integer getFormaMostrar() {
        return formaMostrar;
    }

}

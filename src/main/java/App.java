import java.util.ArrayList;
import java.util.Scanner;

import clases.ControladorDePregutas;
import clases.Pregunta;
import utilities.AgregarPreguntas;
import utilities.ConectionToSQL;

public class App {
    public static void main(String[] args) {
        System.out.println("Funciona!");
        Scanner read= new Scanner(System.in);
        //System.out.println(numero);
        //System.out.println(numero);
        //ConectionToSQL con= new ConectionToSQL();
        //con.connectionSql();
        AgregarPreguntas qwerty = new AgregarPreguntas();
        Integer rondaActual=1,opcion;
        // qwerty.agregarTodasLasPreguntas();
        //ArrayList<Pregunta> preguntas = qwerty.agregarTodasLasPreguntas();
        //String pregunta=preguntas.get(5).toString();


        ControladorDePregutas control = new ControladorDePregutas();
        control.agregarPreguntas(qwerty.agregarTodasLasPreguntas());
        Integer formaI=control.getFormaMostrar();
        rondaActual=control.getRondaJuego();
        String rCorrecta=control.mostrarPreguntas();

        System.out.println(rCorrecta+" forma:"+formaI);
        System.out.println("Ingrese su respuesta opciones validas (1,2,3,4)");
        opcion=read.nextInt();
        if(opcion==formaI){
            System.out.println("Correcto");
            rondaActual+=1;
            control.setRondaJuego(rondaActual);
            control.mostrarPreguntas();
        }else{
            System.out.println("Incorrecto");
        }


    }
}

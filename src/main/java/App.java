import java.util.ArrayList;

import clases.ControladorDePregutas;
import clases.Pregunta;
import utilities.AgregarPreguntas;
import utilities.ConectionToSQL;

public class App {
    public static void main(String[] args) {
        System.out.println("Funciona!");
        ConectionToSQL con= new ConectionToSQL();
        con.connectionSql();
        AgregarPreguntas qwerty = new AgregarPreguntas();
        // qwerty.agregarTodasLasPreguntas();
        //ArrayList<Pregunta> preguntas = qwerty.agregarTodasLasPreguntas();
        //String pregunta=preguntas.get(5).toString();


        ControladorDePregutas control = new ControladorDePregutas();
        control.agregarPreguntas(qwerty.agregarTodasLasPreguntas());
        String rCorrecta=control.mostrarPreguntas();
        System.out.println(rCorrecta);


    }
}

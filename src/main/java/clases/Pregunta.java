package clases;

/**
 * La clase Pregunta recibe en su contructor 6 parametros:
 * La categoria de la pregunta, la pregunta, la respuesta
 * correcta y 3 respuesta incorrectas.
 */
public class Pregunta {
    String categoria;
    String pregunta;
    String rcorrecta;
    String incorrecta1;
    String incorrecta2;
    String incorrecta3;

    public Pregunta(String categoria, String pregunta, String rcorrecta, String incorrecta1, String incorrecta2,
            String incorrecta3) {
        this.categoria = categoria;
        this.pregunta = pregunta;
        this.rcorrecta = rcorrecta;
        this.incorrecta1 = incorrecta1;
        this.incorrecta2 = incorrecta2;
        this.incorrecta3 = incorrecta3;
    }


    

}

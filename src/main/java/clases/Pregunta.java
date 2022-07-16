package clases;

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

    @Override
    public String toString() {
        return "Pregunta [categoria=" + categoria + ", pregunta=" + pregunta + ", respuesta=" + rcorrecta
                + ", incorrecta1=" + incorrecta1 + ", incorrecta2=" + incorrecta2 + ", incorrecta3=" + incorrecta3
                + "]";
    }

    

}

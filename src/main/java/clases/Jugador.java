package clases;

public class Jugador {
    private String nombre;
    private Integer puntaje;
    
    public Jugador(String nombre, Integer puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPuntaje() {
        return puntaje;
    }
}

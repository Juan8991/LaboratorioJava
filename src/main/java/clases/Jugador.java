package clases;

/**
 * Clase Jugador que recibe 2 parametros y los guarda como atributos propios,
 * nombre y puntaje.
 * Esta clase se utiliza guardar la información de cada jugador, la cual despues
 * se utilizará para guardarse en el localStorage.
 */
public class Jugador {
    private String nombre;
    private Integer puntaje;

    public Jugador(String nombre, Integer puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    /**
     * permite obtener el nombre del objeto Jugador
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * permite obtener el puntaje del objeto Jugador
     * 
     * @return
     */
    public Integer getPuntaje() {
        return puntaje;
    }
}

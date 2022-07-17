package utilities;

import clases.Jugador;

import java.sql.PreparedStatement;

public class DbOperaciones {
    MessagesWithJboss message=new MessagesWithJboss();
    /*
     * este metodo nos permite guardar los atributos del jugador
     */
    public void saveJugador(Jugador jugador, ConectionToSQL conection){
        try{
            PreparedStatement statement = conection.connectionSql().prepareStatement("INSERT INTO jugador (nombre,puntaje)"
                    + "  VALUES (?,?)");
            statement.setString(1,jugador.getNombre());
            statement.setInt(2,jugador.getPuntaje());
            statement.execute();
            message.printMessage("Jugador guardado con exito");
        }catch (Exception e){
            message.printMessage("No se pudo guardar los datos");
            message.printMessage(e.getMessage());
        }

    }
    
}

package utilities;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * esta clase nos permite establecer la conexion a la base de datos mysql de nombre laboratorio_java
 */

public class ConectionToSQL {
    Connection conection=null;
    MessagesWithJboss message=new MessagesWithJboss();
    public Connection connectionSql(){
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3325/laboratorio_java","root","");
            message.printMessage("Conexión exitosa!");

        }catch (Exception e){
            message.printMessage("No se pudo establecer la conexión a la base de datos!");
            message.printMessage(e.getMessage());
        }
        return conection;
    }
}

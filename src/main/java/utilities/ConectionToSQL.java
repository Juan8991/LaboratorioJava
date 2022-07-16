package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConectionToSQL {
    Connection conection=null;
    MessagesWithJboss message=new MessagesWithJboss();
    public Connection connectionSql(){
        try{
            //conection = DriverManager.getConnection("jdbc:mysql://localhost:3325/laboratorio_java","root","");
            conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/laboratorio_java","postgres","qwerty");
            Statement statement = conection.createStatement();
            message.printMessage("Conexión exitosa!");

        }catch (Exception e){
            message.printMessage("No se pudo establecer la conexión a la base de datos!");
            message.printMessage(e.getMessage());
        }
        return conection;
    }
}

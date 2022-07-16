import utilities.ConectionToSQL;

public class App {
    public static void main(String[] args) {
        System.out.println("Funciona!");
        ConectionToSQL con= new ConectionToSQL();
        con.connectionSql();
    }
}

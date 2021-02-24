import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName="";
    static String password="2323Mk--";
    static String dbUrl="jdbc:mysql://localhost:3306/world";
    public static void main(String[] args){
        //jdps kütüphaneleri ile data base e bağlanılır
        //java-->jdbs--> oracle/mysql/vs Driverlar --> Database
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Bağlantı oluştu");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }finally {
            try {
                connection.close();

            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }

        }
    }


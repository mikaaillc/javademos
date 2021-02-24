import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        //jdps kütüphaneleri ile data base e bağlanılır
        //java-->jdbs--> oracle/mysql/vs Driverlar --> Database
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;//insert bu statment ile yapılır

        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql="insert into world.city (name ,countryCode,district ,population) values" +
                    "(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Yozgat");
            statement.setString(2,"TUR");
            statement.setString(3,"Yozgat");
            statement.setInt(4,200000);

            statement.executeUpdate();// update işlemleri statement hazılandıktan
            // sonra bu
            // şekilde yapılır
            System.out.println("Kayıt Eklendi:");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            statement.close();
            connection.close();
        }


    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();// bu bağlantı için creat etmemiz gerekir
            resultSet = statement.executeQuery("select code,Name,Continent,region from world.country");
            ArrayList<Country> countries = new ArrayList<>();

            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("code"),
                        resultSet.getString("name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
            System.out.println(exception.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }
}


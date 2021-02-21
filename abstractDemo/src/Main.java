public class Main {

    public static void main(String[] args) {

        CurtomerManager curtomerManager =new CurtomerManager();
        curtomerManager.databaseManager =new MySqlDatabaseManager();// burada database değişiliği yapılıyor
        curtomerManager.getCustomers();

    }
}

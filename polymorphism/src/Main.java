public class Main {

    public static void main(String[] args) {
        //çok biçimlilik
        //inherit varsa
        /*BaseLogger[] loggers =new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
        for (BaseLogger logger:loggers){
            logger.Log(" Log Mesajı");
        }*/
        CustomerManager customerManager =new CustomerManager(new FileLogger());
        customerManager.add();
    }
}

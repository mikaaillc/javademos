public class ConsoleLogger extends BaseLogger{
    public void log(String message){
        System.out.println("log to console:"+message);
    }
}
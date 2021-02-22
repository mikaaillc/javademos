public class BalanceInsufficentException extends Exception{
    String message;
    public BalanceInsufficentException(String message){
        //newlendiği zaman bu class burda gelen parametreyi bu class
        // içindeki message değişkenine eşitleyip override ettiğimiz operasyon
        this.message=message;
    }
    @Override
    public String getMessage() {
        return this.message;//
    }
}

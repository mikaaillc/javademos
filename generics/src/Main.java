import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<String > sehirler = new ArrayList<String>();// küçüktür büyüktür içinde tip verilince generic class
//        // olur
//        sehirler.add("Ankara");
//        sehirler.add("İst");
        //genericler ile birbirine benzeyen operasyonları aynı formatta yazabiliriz.
        //Customer
        //Product
        //Validator

        MyList<Customer > sehirler =new MyList<>();
        sehirler.add(new Customer());// burada şehirler customer nesnesi ile çalışır


    }
}

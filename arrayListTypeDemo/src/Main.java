import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler =new ArrayList<>();// <> arasın hangi tip ile çalışalacağı yazılır.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");
        sehirler.remove("İstanbul");//istanbul listenden silindi
        Collections.sort(sehirler);//sehirler listesini sıralar
        for(String sehir:sehirler){// sehirler listesini sırayla yazdırır
            System.out.println(sehir);
        }

    }
}

import java.net.StandardSocketOptions;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = " Bugün Hava Güzel  ";

        /*System.out.println(mesaj);
        System.out.println("Eleman sayısı " + mesaj.length());
        System.out.println("5.eleman " + mesaj.charAt(4));// string ifadenin 4. eleman
        System.out.println(mesaj.concat(". yağmur yok"));// ekleme yapar
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));// B ile başlarsa true döner
        System.out.println(mesaj.endsWith("."));// nokta ile biterse true döner
        char[] karakterler =new char[5];
        mesaj.getChars(0,5,karakterler,0);// 0dan 4 e kadar olan karakterleri alır
        System.out.println(karakterler);
        System.out.println((mesaj.indexOf("ava")));//ilk a nın kaçıncı eleman olduğunu söyler
        System.out.println((mesaj.lastIndexOf("a")));//ilk a nın kaçıncı eleman olduğunu söyler*/
        String yeniMesaj=mesaj.replace(' ','-');// yeni metin oluşur
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,4));// 2. indexten itibaren mesajı alır 4. indexe  e kadar
        for (String kelime : mesaj.split(" ")) {//boşluk karakterine göre ayırır
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());

    }
}

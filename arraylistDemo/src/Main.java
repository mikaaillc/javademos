import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    /*int[] sayilar =new int[]{1,2,3,};// bu diznin alamı kalmadı
	    sayilar = new int[4];
        System.out.println(sayilar[0]);*/
        ArrayList sayilar =new ArrayList();
        System.out.println(sayilar.size());// size elemana sayısı olarak bilgi veririr
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar);
        System.out.println(sayilar.size());// size elemana sayısı olarak bilgi veririr
        System.out.println(sayilar.get(2));// 2. indexteki elemanı verir
        sayilar.set(1,100); // 2. indexteki eleman 100 iledeğiştirilir
        System.out.println(sayilar);
//        sayilar.remove(0);// sıfırıncı indexteki elemanı siler liste sola kayar
//        System.out.println(sayilar);
//        sayilar.clear();// sayilar listesinin bütün elemanlarını siler
//        System.out.println(sayilar);

        for (Object i:sayilar){ // i burda obje olmalıdır array listin elemanları farklılık gösterebilir
            System.out.println(i);
        }

    }
}

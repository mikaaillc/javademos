public class Main {

    public static void main(String[] args) {
        String mesaj="Hava güzel";
        String yeni= sehir();
        System.out.println(yeni);
        int sayi  = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,6,4);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil () {
        System.out.println("silindi");
    }
    public static void guncelle () {
        System.out.println("guncellendi");
    }
    public static  int topla(int sayi1, int sayi2){// bu fonsiyon in şeklinde bir değer döndürür
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){ // veriables arguments args
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehir(){
        return "Ankara";
    }
}

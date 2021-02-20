public class Main {

    public static void main(String[] args) {
        String mesaj="Hava güzel";
        String yeni= sehir();
        System.out.println(yeni);
        int sayi  = topla(15,7);
        System.out.println(sayi);
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
    public static String sehir(){
        return "Ankara";
    }
}

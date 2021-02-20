public class Main {

    public static void main(String[] args) {
	    String[] ogrenciler = new String[4]; // dizi oluşturuldu
	    ogrenciler[0]="Ali";
	    ogrenciler[1]="Ahmet";
	    ogrenciler[2]="Salih";
	    ogrenciler[3]="veli";

        for (int i = 0; i<  ogrenciler.length ; i++) {
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci:ogrenciler) {
            System.out.println((ogrenci));
        }
    }
}

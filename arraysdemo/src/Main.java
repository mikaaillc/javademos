public class Main {

    public static void main(String[] args) {
//	    String[] ogrenciler = new String[4]; // dizi oluşturuldu
//	    ogrenciler[0]="Ali";
//	    ogrenciler[1]="Ahmet";
//	    ogrenciler[2]="Salih";
//	    ogrenciler[3]="veli";
//
//        for (int i = 0; i<  ogrenciler.length ; i++) {
//            System.out.println(ogrenciler[i]);
//        }
//        for (String ogrenci:ogrenciler) {
//            System.out.println((ogrenci));
//        }
        double[] myList = {1.2, 1.3, 1.4, 5.8, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            System.out.println(number);
            total = total + number;
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Enbüyük " + max);
        System.out.println(total);
    }
}

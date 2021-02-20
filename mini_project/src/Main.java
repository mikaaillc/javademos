public class Main {

    public static void main(String[] args) {
        /*int sayi = 1;
//        int remainder = sayi % 2;
//        System.out.println(remainder);
        boolean isPrime = true;

        if (sayi <2) {
            System.out.println("Geçersiz sayı");
            return;
        }

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Sayı asaldır");
            } else {
                System.out.println("Sayı değildir.");
            }*/
        /////////////////////////////////////////////////////////////////
        /*char harf = 'E';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }*/
        //////////////////////////////////////////////////////////////////////
        //6 -->1 , 2 ,3
        /*int number = 5;
        int total=0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total=total+i;
                if(total==number){
                    System.out.println("Bu sayı mükemmel sayıdır");
                }
                else{
                    System.out.println("Bu sayı mükemmel değildir");
                }
            }
        }*/
        ///////////////////////////////////////////////////////////////////////
        ///220-284
        /*int sayi = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }}
            if (sayi == toplam2 && sayi2== toplam1) {
                System.out.println("bu iki sayı ardakaştır");
            }else{
                System.out.println("bu iki sayı arkdadaş değildir");
            }*/
            /////////////////////////////////////////////////////////////////////
            int[] sayilar = new int[]{1,2,3,5,6,7,4,1};
            int aranacak =50 ;
            boolean varMi=false;
        for (int sayi:sayilar) {
            if (sayi== aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayi dizide mevcut");
        }
        else{
            System.out.println("Sayı mevcut değil");
        }

    }
}

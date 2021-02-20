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
        int number = 5;
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
        }


    }
}

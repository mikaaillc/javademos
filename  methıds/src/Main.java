public class Main {

    public static void main(String[] args) {
       sayibulma();
    }
    public static void sayibulma(){
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
           mesafVer("Sayı mevcuttur:"+aranacak);
        }
        else{
            mesafVer("Sayı mevcuttur:"+aranacak);
        }
    }
    public static void mesafVer(String mesaj){//parametreli metod
        System.out.println(mesaj);
    }
}

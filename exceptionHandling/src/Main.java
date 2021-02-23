public class Main {

    public static void main(String[] args) {
        try{
        int[] sayilar = new int []{1,2,3};
        System.out.println(sayilar[4]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){//üstteki iki hata hariç hata olursa diye yazılır
            System.out.println("Loglandı :"+exception);
        }
        finally {// ister try ister catch çalışsın her türlü çalışan bloktur
            System.out.println("Her Türlü Çalışır");
        }

    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {// try catc içine yazmak zorunda
        BufferedReader reader =null;
        int total =0;
        try {
            reader=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\javademos\\readingFileDemo\\src\\sayilar" +
                    ".txt"));
            String  line =null;
            while ((line =reader.readLine())!=null) {
                total+=Integer.valueOf(line);// line string geleceğinden integera çevirir
            }
            System.out.println("Toplam:"+total);
        } catch (FileNotFoundException e) {// dosya bulamazsam hatasını otomatik ekledik
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {// bu try catch bloğunu eğer dosya bulunmaz ise kapatılacak dosyada olmayacağı koyuyoruz
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

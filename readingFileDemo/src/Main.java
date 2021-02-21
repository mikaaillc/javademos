import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader =null;
        try {
            reader=new BufferedReader(new FileReader("C:\\Users\\asus\\Desktop\\javademos\\readingFileDemo\\src\\sayilar" +
                    ".txt"));
        } catch (FileNotFoundException e) {// dosya bulamazsam hatasını otomatik ekledik
            e.printStackTrace();
        }finally {
            try {// bu try catch bloğunu eğer dosya bulunmaz ise kapatılacak dosyada olmayacağı koyuyoruz
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
            String _file="C:\\Users\\asus\\Desktop\\javademos\\files\\students.txt";
            //createFile(_file);
            //getFileInfo(_file);
            readFile(_file);
            writeFile(_file);
            readFile(_file);


    }
    public static void createFile(){
        File file =new File("C:\\Users\\asus\\Desktop\\javademos\\files\\students.txt");
        try {
            if(file.createNewFile()){// burada true yada false değer döner
                System.out.println("Dosya oluşturuldu.");}
            else{
                System.out.println("Dosya mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(String _file){
        File file =new File(_file);
        if(file.exists()){//BU komut dosya var ise true döndürür
            System.out.println("Dosya adı:"+file.getName());//Burada dosyanın ismini okuruz
            System.out.println("Dosya Yolu:"+file.getAbsolutePath());// getAbsolutePath ile konum
            // okunabilir
            System.out.println("Dosya yazılabiliir Mi?:"+file.canWrite());
            System.out.println("Dosya okunabilir Mi?:"+file.canRead());
            System.out.println("Dosya boyutu:(byte)"+file.length());

        }
    }
    public static void readFile(String _file){
        File file =new File(_file);
        try {
            Scanner reader =new Scanner(file);
            while (reader.hasNextLine()){//okuyabileceği satır olduğu sürece devam et demek oluyor
                String line = reader.nextLine();//satır varsa oku
                System.out.println(line);
            }
            reader.close();// dosyanın kapatılması gerekir
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(String _file){
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter(_file,true));//true parametresi ile append
            // özeliği açılmış oldu
            writer.newLine();// yeni satır oluştur ve ekle anlamında
            writer.write("Ali");
            System.out.println("Dosyaya yazıldı");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

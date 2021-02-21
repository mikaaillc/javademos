//built-in
import matematik.*;// matematik paketindeki herşeyi import et
import java.util.Scanner;//import ile paket iletişimi olur

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        System.out.println("Adınız:");
        String isim = scanner.nextLine();
        System.out.println("Merhaba "+isim);

        DortIslem dortIslem =new DortIslem();
        System.out.println(dortIslem.topla(2,6));
        Logaritma logaritma =new Logaritma();
    }
}

public class Main {

    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel :eçtiniz");
                break;
            case 'B':
                System.out.println("iyi :geçtiniz");
                break;
            case 'C':
                System.out.println("geçtiniz");
                break;
            default:
                System.out.println("Geçersiz");
        }
    }
}

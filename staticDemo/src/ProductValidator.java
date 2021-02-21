public class ProductValidator { // ana class static olmaz


    static {
        System.out.println("static Yapıcı Blok çalıştı");
    }
    public static boolean isValid(Product product) {// static bu nesnenin örneğini 1 kere oluşturur
        //static bellekten atılmaz new gibi değildir.,
        // bir metod static yapılırsa class ismi ile direk çağrılır.
        //
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;

        }else {
            return false;
        }
    }
    public static class baskaclass{//inner class
        public static void sil(){

        }
    }

}


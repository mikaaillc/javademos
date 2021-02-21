public class Main {

    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","Asus Laptop",5000,3,"black") ;




        ProductManager productManager =new ProductManager();
        productManager.Add(product);
        //System.out.println(product.name);
        System.out.println(product.getKod());

    }
}

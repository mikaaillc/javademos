public class Main {

    public static void main(String[] args) {
        //tamamlanmamış operasyonlar içeririler interfacesler
        //bir class birden fazla interface implemente edebilir
        // interfaceler newlemez
        //referans tutucudurlar
//        ICustomerDal customerDal =new OracleCustomerDal();
        CustomerManager customerManager=new CustomerManager(new SqlCustomerDal());
        customerManager.add();

    }
}

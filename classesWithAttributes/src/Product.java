public class Product {
    //attiribute or field
    private int id;
    private String name;
    private String desciription;
    private double price;
    private int stockAmount;
    private String colour;
    private String kod;
    //getter
    public int getId() {
        //değişiklik de yapılabilir
        return id;
    }
    //setter
    public void setId(int id){
        this.id=id;// this bu class id içini kasteder
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciription() {
        return desciription;
    }

    public void setDesciription(String desciription) {
        this.desciription = desciription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

}

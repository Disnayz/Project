public class Product {
    private int quantity;
    private double buyPrice;
    private double sellPrice;
    private String name;

    public Product(int quantity, double buyPrice, double sellPrice, String name) {
        this.quantity = quantity;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice +
                ", name='" + name + '\'' +
                '}';
    }
}

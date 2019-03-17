public class Fries implements IItem {
    private int quantity;
    private double price;
    private String description;

    public Fries(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price * quantity;
    }

    public String getDescription() {
        return description;
    }
}

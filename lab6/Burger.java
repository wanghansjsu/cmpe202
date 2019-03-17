import java.util.ArrayList;
import java.util.List;

public class Burger implements IItem{
    private int quantity;
    private double price;
    private String description;
    private List<Topping> toppings;

    public Burger(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        toppings = new ArrayList<>();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return quantity * price;
    }

    public String getDescription() {
        return description;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}

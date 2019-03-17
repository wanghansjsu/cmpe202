import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private double subtotal = 0.0;
    private List<IItem> items;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        items = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public List<IItem> getItems() {
        return items;
    }

    public void addItem(IItem i) {
        items.add(i);
        subtotal += i.getPrice();
    }
}

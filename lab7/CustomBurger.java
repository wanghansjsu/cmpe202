public class CustomBurger extends Composite implements IPriceDecorator {

    private double price;

    public CustomBurger(String description) {
        super(description);
        price = 0.0;
    }

    public double getPrice() {
        for(IComposite c : components) {
            if(c instanceof IPriceDecorator)
                price += ((IPriceDecorator) c).getPrice();
        }

        return price;
    }

}

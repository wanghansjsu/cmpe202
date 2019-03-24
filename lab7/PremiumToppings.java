public class PremiumToppings extends ComponentDecorator {

    public PremiumToppings(String description, String[] options) {
        super(description);
        setOptions(options);
    }

    public void setOptions(String[] options) {
        super.setOptions(options);

        int quantity = options.length;
        price += quantity * 1.00;

        for(String o : options) {
            if(o.equals("Marinated Tomatoes"))
                price += 2.00;
        }
    }
}

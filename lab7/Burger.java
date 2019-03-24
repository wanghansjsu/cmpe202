public class Burger extends ComponentDecorator {

    public Burger(String description, String[] options) {
        super(description);
        setOptions(options);
    }

    public void setOptions(String[] options) {
        super.setOptions(options);

        for(String o : options) {
            switch(o) {
                case "Organic Bison*":
                    price += 4.00;
                    break;
                case "Ahi Tuna":
                    price += 4.00;
                    break;
                case "1/3lb.":
                    price += 9.00;
                    break;
                case "1/2lb.":
                    price += 12.00;
                    break;
                case "1lb.":
                    price += 18.00;
                    break;
                case "In A Bowl":
                    price += 1.00;
                    break;
            }
        }
    }
}

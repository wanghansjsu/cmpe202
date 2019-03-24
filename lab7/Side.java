public class Side extends ComponentDecorator {

    public Side(String description, String[] options) {
        super(description);
        setOptions(options);
    }

    public void setOptions(String[] options) {
        super.setOptions(options);

        price += options.length * 3.00;
    }
}

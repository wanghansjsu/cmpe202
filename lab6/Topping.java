enum ToppingType {
    TOP_BUN,
    ON_MEAT,
    BOTTOM_BUN
}

public class Topping implements IItem{
    private String description;
    private ToppingType toppingType;

    public Topping(String description, ToppingType toppingType) {
        this.description = description;
        this.toppingType = toppingType;
    }

    public String getDescription() {
        String formalizedDescription;
        switch (toppingType) {
            case TOP_BUN:
                formalizedDescription = "{{{ %s }}}";
                break;
            case ON_MEAT:
                formalizedDescription = "%s";
                break;
            case BOTTOM_BUN:
                formalizedDescription = "->|%s";
                break;
            default:
                formalizedDescription = "%s";
        }

        return String.format(formalizedDescription, description.toUpperCase());
    }
}

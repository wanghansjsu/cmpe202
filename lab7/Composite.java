import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Composite implements IComposite {

    private String description;
    protected List<IComposite> components;

    public Composite(String description) {
        this.description = description;
        components = new ArrayList<>();
    }

    public void addChild(IComposite composite) {
        components.add(composite);
    }

    public void removeChild(IComposite composite) {
        components.remove(composite);
    }

    public String getDescription() {
        StringBuffer sb = new StringBuffer();
        sb.append(description);

        if(this instanceof IPriceDecorator) {
            DecimalFormat df = new DecimalFormat("#.00");
            double price = ((IPriceDecorator) this).getPrice();
            sb.append(" ");
            sb.append(df.format(price));
        } else {
            sb.append("\n\n");
        }

        sb.append("\n");

        for(IComposite c : components) {
            sb.append(c.getDescription());
            sb.append("\n");
        }

        sb.append("\n\n");

        return sb.toString();
    }

    public IComposite getChild(int index) {
        if(index >= components.size())
            return null;

        return components.get(index);
    }
}

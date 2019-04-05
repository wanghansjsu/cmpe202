public class CardExpDecorator extends Decorator {

    public CardExpDecorator(CreditCardField target) {
        super(target);
    }

    public String display() {
        String cardExp = target.display();
        StringBuffer sb = new StringBuffer(cardExp);

        if(cardExp.length() < 4)
            sb.append(addSpaces(4 - cardExp.length()));

        sb.insert(2, "/");

        sb.append("]  ");
        sb.insert(0, "[");

        return sb.toString();
    }
}

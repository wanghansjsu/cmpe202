public class CardNumDecorator extends Decorator {

    public CardNumDecorator(CreditCardField target) {
        super(target);
    }

    public String display() {
        String cardNumber = target.display();
        StringBuffer sb = new StringBuffer(cardNumber);

        if(cardNumber.length() < 16)
            sb.append(addSpaces(16 - cardNumber.length()));

        sb.insert(12, " ");
        sb.insert(8, " ");
        sb.insert(4, " ");

        sb.append("]  ");
        sb.insert(0, "[");

        return sb.toString();
    }

}

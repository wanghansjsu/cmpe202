public class CardCVCDecorator extends Decorator {

    public CardCVCDecorator(CreditCardField target) {
        super(target);
    }

    public String display() {
        String cardCVC = target.display();
        StringBuffer sb = new StringBuffer(cardCVC);

        if(cardCVC.length() < 3)
            sb.append(addSpaces(3 - cardCVC.length()));

        sb.append("]  ");
        sb.insert(0, "[");

        return sb.toString();
    }
}

public class Decorator implements IDisplayComponent, IKeyEventHandler {

    protected CreditCardField target;
    protected IKeyEventHandler nextHandler;

    public Decorator(CreditCardField target) {
        this.target = target;
    }

    public void setNext(IKeyEventHandler next) {
        //this.nextHandler = next;
        target.setNext(next);
    }

    public String display() {
        return target.display();
    }

    public void key(String ch, int cnt) {
        target.key(ch, cnt);
    }

    public void addSubComponent( IDisplayComponent c ) {
        return; // do nothing
    }

    public void clear() {
        target.clear();
    }

    public String addSpaces(int num) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < num; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}

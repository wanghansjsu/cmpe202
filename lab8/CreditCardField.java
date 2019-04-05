public class CreditCardField implements IDisplayComponent, IKeyEventHandler {

    protected IKeyEventHandler nextHandler;

    public void setNext( IKeyEventHandler next) {
        this.nextHandler = next ;
    }

    public String display() {
        return "[]";
    }

    public void key(String ch, int cnt) {
        nextHandler.key(ch, cnt);
    }

    public void addSubComponent( IDisplayComponent c ) {
        return ; // do nothing
    }

    public void clear() {
        return; // do nothing
    }
}

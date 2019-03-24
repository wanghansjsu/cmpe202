public class Main {

    public static void main(String[] args) {
        IComposite order = BuildOrder.getOrder();
        System.out.println(order.getDescription());
    }
}

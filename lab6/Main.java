public class Main {
    public static void main(String[] args) {
        Order order = new Order(45);

        Burger burger = new Burger("LBB",5.59, 1);
        burger.addTopping(new Topping("BACON", ToppingType.TOP_BUN));
        burger.addTopping(new Topping("LETTUCE", ToppingType.ON_MEAT));
        burger.addTopping(new Topping("TOMATO", ToppingType.ON_MEAT));
        burger.addTopping(new Topping("G ONION", ToppingType.BOTTOM_BUN));
        burger.addTopping(new Topping("JALA Grilled", ToppingType.BOTTOM_BUN));
        Fries fries = new Fries("LTL CAJ", 2.79, 1);

        order.addItem(burger);
        order.addItem(fries);

        Printer printer = new Printer(order);
        System.out.println("RECEIPT:");
        printer.printOrder(PrintType.RECEIPT);
        System.out.println("PACKAGING SLIP:");
        printer.printOrder(PrintType.PACKING_SLIP);

    }
}

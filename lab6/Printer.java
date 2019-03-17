import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

enum PrintType {
    RECEIPT,
    PACKING_SLIP
}

public class Printer {
    private StringBuilder output;
    private Order order;
    private int maxWidth = 40;

    public Printer(Order order) {
        this.order = order;
        output = new StringBuilder();
    }

    public void printOrder(PrintType printType) {
        if(printType == PrintType.RECEIPT) {
            addStoreInfo();
            addHeader();
            addOrderNum();
            addOrderDetails(true);
            addCheckDetails(20);
            addCashierInfo();
            addFooter();
        } else if (printType == PrintType.PACKING_SLIP) {
            addOrderNum();
            addHeader();
            addOrderDetails(false);
            addCashierInfo();
        }
        System.out.println(output.toString());
        output = new StringBuilder();
    }

    private void addStoreInfo() {
        putOnMiddle("FIVE GUYS");
        putOnMiddle("BURGERS AND FRIES");
        putOnMiddle("STORE # CA-1294");
        putOnMiddle("5353 ALMADEN EXPY N60");
        putOnMiddle("SAN JOSE, CA 95118");
        putOnMiddle("(P) 408-264-9300");
        addln(3);
    }

    private void addHeader() {
        addTime();
        addln();
        addCompanyName();
    }

    private void addTime() {
        DateFormat df = new SimpleDateFormat("MM/d/yyyy hh:mm:ss aa");
        Date date = new Date();
        putOnMiddle(df.format(date));
    }

    private void addCompanyName() {
        putOnMiddle("FIVE GUYS");
    }

    private void addOrderNum() {
        putOnLeft("Order Number: " + order.getOrderNumber());
    }

    private void addOrderDetails(boolean includePrice) {
        for(IItem item: order.getItems()) {
            addItemRow(item, includePrice);
            if(item instanceof Burger) {
                addToppings(((Burger) item).getToppings());
            }
        }
        addln();
    }

    private void addCheckDetails(double cash) {
        double subtotal = order.getSubtotal();
        double tax = subtotal * 0.09;
        double total = subtotal + tax;
        double change = cash - total;

        String s = "";
        s += paddingSpaces(3) + "Sub. Total:" + paddingSpaces(maxWidth - 21) +
                getDollarString(subtotal) + "\n";
        s += paddingSpaces(3) + "Tax:" + paddingSpaces(maxWidth - 14) +
                getDollarString(tax) + "\n";
        s += paddingSpaces(3) + "Total:" + paddingSpaces(maxWidth - 16) +
                getDollarString(total) + "\n";
        s += "\n";
        s += paddingSpaces(3) + "Cash" + paddingSpaces(maxWidth - 14) +
                getDollarString(cash) + "\n";
        s += paddingSpaces(3) + "Change" + paddingSpaces(maxWidth - 16) +
                getDollarString(change);
        output.append(s);
        addln();
    }

    private void addCashierInfo() {
        String s = "";
        s += "Register:1" + paddingSpaces(maxWidth - 30);
        s += "Tran Seq No:" + String.format("%8d", 57845);
        output.append(s);
        addln();
        putOnLeft("Cashier:Sakda* S.");
    }

    private void addFooter() {
        putOnMiddle("************************************");
        putOnMiddle("Don't throw away your receipt!!!");
        addln();
        putOnMiddle("Help Five Guys and you could win!");
    }

    private void addItemRow(IItem item, boolean includePrice) {
        String s = "";
        s += String.format("%-3d", item.getQuantity());
        s += String.format("%-31s", item.getDescription());
        if(includePrice == true)
            s += String.format("%6.2f", item.getPrice());
        output.append(s);
        addln();
    }

    private void addToppings(List<Topping> toppings) {
        for(Topping t: toppings) {
            putOnLeft(t.getDescription(), 6);
        }
    }

    private void addln() {
        addln(1);
    }

    private void addln(int num) {
        for(int i = 0; i < num; i++) {
            output.append('\n');
        }
    }

    private void putOnLeft(String s) {
        putOnLeft(s, 0);
    }

    private void putOnLeft(String s, int padNum) {
        output.append(paddingSpaces(padNum));
        output.append(s);
        addln();
    }

    private void putOnMiddle(String s) {
        if(s.length() < maxWidth) {
            int padNum = (maxWidth - s.length()) / 2;
            s = paddingSpaces(padNum) + s;
        }
        output.append(s);
        addln();
    }

    private String getDollarString(double price) {
        return String.format("%7s", String.format("$%.2f", price));
    }

    private String paddingSpaces(int num) {
        String spaces = "";
        for(int i = 0; i < num; i++) {
            spaces += " ";
        }

        return spaces;
    }
}

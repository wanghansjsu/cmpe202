public class BuildOrder {

    public static IComposite getOrder() {
        Composite order = new Order("Order");

        CustomBurger customBurger = new CustomBurger("Build Your Own Burger");

        String[] bgo1 = { "Organic Bison*", "1/2lb.", "On A Bun" };
        customBurger.addChild(new Burger("Burger Options", bgo1));

        String[] co1 = { "Yellow American", "Spicy Jalapeno Jack" };
        customBurger.addChild(new Cheese("Cheese Options", co1));

        String[] pco1 = { "Danish Blue Cheese" };
        customBurger.addChild(new PremiumCheese("Premium Cheese Options", pco1));

        String[] sao1 = { "Mayonnaise", "Thai Peanuts Sauce" };
        customBurger.addChild(new Sauce("Sauce Options", sao1));

        String[] to1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"  };
        customBurger.addChild(new Toppings("Toppings Options", to1));

        String[] pto1 = { "Marinated Tomatoes" };
        customBurger.addChild(new PremiumToppings("Premium Toppings Options", pto1));

        String[] buno1 = { "Ciabatta (Vegan)" };
        customBurger.addChild(new Bun("Bun Options", buno1));

        String[] sdo1 = { "Shoestring Fries"};
        customBurger.addChild(new Side("Side Options", sdo1));

        order.addChild(customBurger);

        customBurger = new CustomBurger("Build Your Own Burger");

        String[] bgo2 = { "Hormone & Antibiotics Free Beef*", "1/3lb.", "On A Bun" };
        customBurger.addChild(new Burger("Burger Options", bgo2));

        String[] co2 = { "Smoked Gouda", "Greek Feta" };
        customBurger.addChild(new Cheese("Cheese Options", co2));

        String[] pco2 = { "Fresh Mozzarella" };
        customBurger.addChild(new PremiumCheese("Premium Cheese Options", pco2));

        String[] sao2 = { "Habanero Salsa" };
        customBurger.addChild(new Sauce("Sauce Options", sao2));

        String[] to2 = { "Crushed Peanuts" };
        customBurger.addChild(new Toppings("Toppings Options", to2));

        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" };
        customBurger.addChild(new PremiumToppings("Premium Toppings Options", pto2));

        String[] buno2 = { "Gluten-Free Bun" };
        customBurger.addChild(new Bun("Bun Options", buno2));

        String[] sdo2 = { "Shoestring Fries" };
        customBurger.addChild(new Side("Side Options", sdo2));

        order.addChild(customBurger);

        return order;
    }

}

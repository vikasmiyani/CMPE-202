
public class BuildOrder {

    public static Component getOrder()
    {
        String[] burgerDesc = {"Beef", "1/3lb.", "On A Bun"};
        String[] cheeseDesc = {"Danish Blue Cheese", "Horseradish Cheddar"};
        String[] toppingsDesc = {"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"};
        String[] premiumDesc = {"Applewood Smoked Bacon"};
        String[] sauceDesc = {"Appricot Sauce"};
        
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        CompositeBurger customBurger = new CompositeBurger( "Build Your Own Burger" ) ;
        
        Decorator burger = new Burger();
        burger.setOptions(burgerDesc);
        
        Decorator cheese = new Cheese(burger);
        cheese.setOptions(cheeseDesc);
        
        Decorator toppings = new Toppings(cheese);
        toppings.setOptions(toppingsDesc);
        
        Decorator premium = new Premium(toppings);
        premium.setOptions(premiumDesc);
        
        Decorator sauce = new Sauce(premium);
        sauce.setOptions(sauceDesc);
        
        customBurger.addChild(burger);
        customBurger.addChild(cheese);
        customBurger.addChild(toppings);
        customBurger.addChild(premium);
        customBurger.addChild(sauce);
        customBurger.setPriceDecorator(sauce);
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/
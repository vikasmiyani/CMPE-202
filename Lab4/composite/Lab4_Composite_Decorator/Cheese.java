
/**
 * Write a description of class CheeseDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends Decorator
{    
    public Cheese(PriceDecorator component){
        super(component);
    }
    
    public double calcPrice(){
        double price = component.calcPrice();
       if(options.length > 1){
            price += (options.length - 1) * 1;
        }
        return price;
    }
}

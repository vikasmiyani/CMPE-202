
public class Toppings extends Decorator
{    
    public Toppings(PriceDecorator component){
       super(component); 
    } 
    
    public double calcPrice(){
        double price = component.calcPrice();
         if(options.length > 4){
            price += (options.length - 4) * 0.75;
        }
        return price;
    }
    
    
}

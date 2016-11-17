
public class Sauce extends Decorator
{
    public Sauce(PriceDecorator component){
        super(component);
    }
    
    public double calcPrice(){
        double price = component.calcPrice();
        if(options.length > 1){
            price += (options.length - 1) * 0.75;
        }
        return price;
    }

}

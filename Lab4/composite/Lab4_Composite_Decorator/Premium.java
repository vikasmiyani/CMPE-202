
public class Premium extends Decorator
{
    public Premium(PriceDecorator component){
        super(component);
    }
    
    public double calcPrice(){
        double price = component.calcPrice();
        price += options.length * 1.50;
        return price;
    }
}

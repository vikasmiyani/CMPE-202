import java.util.ArrayList;
import java.text.DecimalFormat;

public class CompositeBurger extends Composite implements PriceDecorator
{
    private ArrayList<Decorator> components = new ArrayList<Decorator>() ;
    private PriceDecorator priceDecorator;
    
    public CompositeBurger(String description){
        super(description);
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description +" "+fmt.format(calcPrice()));
        for (Decorator obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public double calcPrice(){
        return priceDecorator.calcPrice();
    }
    
    public void setPriceDecorator(PriceDecorator priceDecorator){
        this.priceDecorator = priceDecorator;
    }
    
    public void addChild(Decorator c) {
        components.add( c ) ;
    }
     
    public void removeChild(Decorator c) {
        components.remove(c) ;
    }
     
    public Decorator getChild(int i) {
        return components.get( i ) ;
    }
}

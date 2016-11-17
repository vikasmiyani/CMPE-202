
public class Burger extends Decorator
{
    public Burger(){
        super(null);
    }    
    public double calcPrice(){
        double price = 0.0;
        for(String option : options){
            switch(option){
                case "1/3lb.":
                    price += 9.50;
                break;
                case "2/3lb.":
                    price += 11.50;
                break;
                case "1lb.":
                    price += 15.50;
                break;
                case "In A Bowl":
                    price += 1;
                break;
                default:
                break;
            }
        }
        return price;
    }
}

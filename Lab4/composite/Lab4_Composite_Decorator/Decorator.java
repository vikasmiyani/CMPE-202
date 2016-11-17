
public abstract class Decorator extends Leaf implements PriceDecorator
{
    String[] options;
    PriceDecorator component;
    
    public Decorator(PriceDecorator component){
        super("", 0.0);
        this.component = component;
    }
   
    public void setOptions(String[] options){
        this.options = options;
    }
    
    public void printDescription() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < options.length; i++){
            sb.append(options[i]);
            if(i != options.length - 1){
                sb.append(" + ");
            }
        }
        System.out.println(sb.toString());
    }
}

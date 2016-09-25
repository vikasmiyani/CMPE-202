import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Gumball pickGumball(){
        System.out.println("This is inside Green picker");
        Gumball gumBall = new GreenGumball(); 
        return gumBall;
    }
    
    public Message printRole(World w){
    
           GreenfootImage gi;
            gi = new GreenfootImage(100,25);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Green Picker", 10, 17 );
            Message m = new Message() ;
            m.setImage(gi);
            w.addObject(m,670, 560);
            return m;
    }
}

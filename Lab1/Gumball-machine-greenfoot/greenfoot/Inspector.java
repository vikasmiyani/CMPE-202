import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
    }    
   
    public Message printRole(World w){
    
           GreenfootImage gi;
            gi = new GreenfootImage(100,25);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Inspector", 15, 17 );
            Message m = new Message() ;
            m.setImage(gi);
            w.addObject(m,540, 390);
            return m;
    }
    
    public Picker choosePicker(){
        Picker p = new Random().nextBoolean() ? new RandomPicker() : new GreenPicker();
        return p;
    }
    
}

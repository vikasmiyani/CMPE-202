import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{

    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
    }    
    
    public Message printRole(World w){
    
           GreenfootImage gi;
            gi = new GreenfootImage(100,25);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Alien", 15, 17 );
            Message m = new Message() ;
            m.setImage(gi);
            w.addObject(m,540, 390);
            return m;
    }
    public Picker choosePicker(){
        return new Picker();
    }
}

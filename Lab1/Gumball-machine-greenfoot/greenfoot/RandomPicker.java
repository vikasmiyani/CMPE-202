import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Gumball pickGumball(){
        System.out.println("This is inside random picker");
        Gumball gumBall = null;
        int min = 1,max =3;
        int random = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(random);
        
        switch(random){
            case 1:
                gumBall = new RedGumball();
            break;
            case 2:
                gumBall = new BlueGumball();
            break;
            case 3:
                gumBall = new GreenGumball();
            break;
        }
        return gumBall;
    }
    
    public Message printRole(World w){
    
           GreenfootImage gi;
            gi = new GreenfootImage(100,25);
            gi.setColor( java.awt.Color.YELLOW ) ;
            gi.fill() ;
            gi.setColor( java.awt.Color.BLACK ) ;
            gi.drawString( "Random Picker", 10, 17 );
            Message m = new Message() ;
            m.setImage(gi);
            w.addObject(m,660, 200);
            return m;
    }
    
    
}

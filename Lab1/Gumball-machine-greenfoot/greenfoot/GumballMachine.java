import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    int coinType;
    Message coinMsg, crankMsg, roleMsg, m;
    GreenfootImage greenFootImg;
    Picker picker;
    Gumball gumBall;
    World world;
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
        insertCoin();
        turnCrank();
    }    
    
    public void insertCoin(){
         int mouseX, mouseY;

        Actor coin = getOneObjectAtOffset(11,13,Coin.class);
        
         if ( coin != null )
        {
           
            int x = coin.getX();
            int y = coin.getY();
            System.out.println( coin.toString() ) ;
            greenFootImg = new GreenfootImage(100,25);
            greenFootImg.setColor(java.awt.Color.YELLOW) ;
            greenFootImg.fill() ;
            greenFootImg.setColor( java.awt.Color.BLACK ) ;
            greenFootImg.drawString( "Have Coin", 15, 17 );
            coinMsg = new Message() ;
            coinMsg.setImage(greenFootImg);
            if(coin instanceof Penny){
               coinType = 1;
            }else if(coin instanceof FakeQuarter){
                coinType = 2;
            }else if(coin instanceof Quarter){
                coinType = 3;
            }
            world = getWorld();
             if(crankMsg != null){
            world.removeObject( crankMsg ); 
            }
            if(picker != null && gumBall != null){
            world.removeObject( roleMsg );
            world.removeObject( gumBall );
            }
            world.addObject( coinMsg,366, 275 ) ;
            world.removeObject( coin ) ;
            
        }
        
    }
    public void turnCrank(){
         int mouseX, mouseY;
        
        if(Greenfoot.mousePressed(this)) {     
            
            world = getWorld();
            world.removeObject( coinMsg ) ;
            
            System.out.println("Clicked!" ) ;

            greenFootImg = new GreenfootImage(100,25);
            greenFootImg.setColor( java.awt.Color.YELLOW ) ;
            greenFootImg.fill() ;
            greenFootImg.setColor( java.awt.Color.BLACK ) ;
            greenFootImg.drawString( "Crank Turned!", 15, 17 );
            crankMsg = new Message() ;
            crankMsg.setImage(greenFootImg);
            world.addObject( crankMsg,366 , 375 ) ;
            Alien i =  new Inspector();
            i.printRole(world);
            if(coinType == 1){
                greenFootImg = new GreenfootImage(100,25);
                greenFootImg.setColor( java.awt.Color.RED ) ;
                greenFootImg.fill() ;
                greenFootImg.setColor( java.awt.Color.BLACK ) ;
                greenFootImg.drawString( "Only Quarter!!!", 15, 17 );
                m = new Message() ;
                m.setImage(greenFootImg);
                world.addObject( m, 480, 275 ) ;
            }else if(coinType == 2) {
                greenFootImg = new GreenfootImage(100,25);
                greenFootImg.setColor( java.awt.Color.RED ) ;
                greenFootImg.fill() ;
                greenFootImg.setColor( java.awt.Color.BLACK ) ;
                greenFootImg.drawString( "Fake Quarter!!!", 15, 17 );
                m = new Message() ;
                m.setImage(greenFootImg);
                world.addObject( m, 480, 275 ) ;
            }else if(coinType == 3) {
                greenFootImg = new GreenfootImage(100,25);
                greenFootImg.setColor( java.awt.Color.YELLOW ) ;
                greenFootImg.fill() ;
                greenFootImg.setColor( java.awt.Color.BLACK ) ;
                greenFootImg.drawString( "Real Quarter!!!", 15, 17 );
                m = new Message() ;
                m.setImage(greenFootImg);
                world.addObject( m, 480, 275 ) ;
                picker = i.choosePicker();
                roleMsg = new Message();
                roleMsg = picker.printRole(world);
                gumBall = picker.pickGumball();
                world.addObject(gumBall,430, 500);
            } 
            
        
        }
       
    } 
}

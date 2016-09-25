public class Text_sketch{
protected int x;
protected int y;
protected String text;    
protected int fillVal = 0;
protected int textSize = 25;


Text_sketch(){

     fill(fillVal);
     textSize(textSize);
     
     text("Status:",100, 100);
     text("Inventory:",550, 100);
}


public void printInventory(int x, int y,String text){
  
     fill(fillVal);
     textSize(textSize);
     text(text,x, y);
  
} 

public void printStatus(int x, int y,String text){
     
     fill(fillVal);
     textSize(textSize);
     text(text,x, y);
  
} 

public void textClear(int x, int y,String text){

     fill(255);
     textSize(textSize);
     text(text,x, y);
}
}
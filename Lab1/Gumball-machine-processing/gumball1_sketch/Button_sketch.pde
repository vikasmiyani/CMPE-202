public abstract class Button_sketch{
protected int x;
protected int y;
protected int width;
protected int height;
protected String btn_name;
protected int value = 255;
protected boolean isClicked;

Button_sketch(int x, int y, int width, int height,String btn_name){
  this.x = x;
  this.y = y;
  this.width = width;
  this.height = height;
  this.btn_name = btn_name;
} 

void display() {
  
  value = 255;
  if((mouseX > x) && (mouseX < x+width) && (mouseY > y) && (mouseY<y+height)){
  value = 128;
  }else{
   value = 255;
  }
  fill(value);
  rect(x,y,width,height);
  fill(0);
  textSize(25);
  text(btn_name,x+10, y+height-10);
}

abstract void buttonClicked(GumballMachine gumballMachine);
}

public class Insert_Quarter_Btn extends Button_sketch{

  Insert_Quarter_Btn(int x, int y, int width, int height){
    super(x,y,width,height,"Insert Coin");
  } 


  void buttonClicked(GumballMachine gumballMachine) {
    if(mousePressed){
      if(value == 128){
        value = 0;
        if(!isClicked){
          gumballMachine.insertQuarter();
          System.out.println(gumballMachine);
          isClicked=true;
        }
     fill(value); 
     rect(x,y,width,height);
     fill(255);
     textSize(25);
     text(btn_name,x+10, y+height-10);
      }else{
        value = 255;
        fill(value); 
        rect(x,y,width,height);
        fill(0);
        textSize(25);
        text(btn_name,x+10, y+height-10);
      }
    
   
    }else if(!mousePressed){
      isClicked=false;
    }
  }
}
public class Turn_Crank_Btn extends Button_sketch{

Turn_Crank_Btn(int x, int y, int width, int height){
  super(x,y,width,height,"Turn Crank");

} 


void buttonClicked(GumballMachine gumballMachine) {
  if( mousePressed){
    if(value == 128){
    value = 0;
      if(!isClicked){
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        isClicked=true;
      }
     fill(value); 
     rect(x,y,width,height);
     fill(255);
     textSize(25);
     text(btn_name,x+10, y+height-10);
    }else{
      value = 255;
     fill(value); 
     rect(x,y,width,height);
     fill(0);
     textSize(25);
     text(btn_name,x+10, y+height-10);
    }
     
     //fill(0);
     //textSize(25);
     //text(btn_name,x+10, y+height-10);
    
  }else if(!mousePressed){
    isClicked=false;
}

}
}
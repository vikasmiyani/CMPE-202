
Button_sketch insert_quarter;
Button_sketch turn_crank;
Text_sketch text_lable;
GumballMachine gumballMachine;
PFont font;
void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(2);
  strokeCap(ROUND);
  
  // load font
  font = loadFont("BookAntiqua-48.vlw");
  insert_quarter = new Insert_Quarter_Btn(70,500,150,40);
  turn_crank = new Turn_Crank_Btn(70,550,150,40);
  gumballMachine = new GumballMachine(5);
}

void draw() {
    //gumballMachine = new GumballMachine(5);
  fill(0); 
  background(255);
  textFont(font, 32);
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);
  runTest();
}

public void runTest() {
  text_lable = new Text_sketch();
  insert_quarter.display();
  insert_quarter.buttonClicked(gumballMachine);
  text_lable.printInventory(690,100,String.valueOf(gumballMachine.count));
  turn_crank.display();
  turn_crank.buttonClicked(gumballMachine);
  text_lable.printInventory(200,100,gumballMachine.state.toString());
}
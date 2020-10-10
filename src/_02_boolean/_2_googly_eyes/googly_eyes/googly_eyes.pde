
 int x=0;
 int y=0;
 
 PImage face;
void setup() {
 
  face = loadImage("face.jpg");
  
  size(800,600);
  face.resize(800,600);
}

void draw() {
  background(face);
  fill(#FFFFFF);
  ellipse(350,250,200,200);
  
  
  fill(#020312);
  ellipse(x,y,50,50);
   
   fill(#FFFFFF);
  ellipse(580,250,200,200);
  
  
  fill(#020312);
  ellipse(x+230,y,50,50);
  
  if(mouseX>250&&mouseX<450&&mouseY<350&&mouseY>150){
    
  x=mouseX;
  y=mouseY;
  }
  
 



}

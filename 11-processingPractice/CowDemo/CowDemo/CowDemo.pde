ArrayList<Cow> particles;
boolean testing_state = false ;
void setup() {
   size(1000, 800);
  if(!testing_state){
    particles = new ArrayList<Cow>();
    for (int i = 0; i < 100; i++)
      particles.add(new Cow());
  } else {
  }

}

void draw() {
  background(200);
  if(!testing_state){
    for (Cow c : particles) {
      c.move();
      c.display();
      //c.collide(particles);
      
    }
    fill(0);
    textSize(20);
    text("FPS: "+frameRate+"\nCows: "+particles.size(),0,20);
  }else {
    stroke(255);
    ellipse(height/2,width/2,50,50);
    stroke(0);
    ellipse(height/2 -50*.2, width/2 -50*.2, 50*.125, 50*.25);
  }
 
}

void mousePressed() {
  if(mouseButton == RIGHT){
    Cow gen = new Cow(20+(int)(Math.random()*30), mouseX, mouseY, 
      random(6)-3,
      random(6)-3);
     particles.add(gen);
  }
  if(mouseButton == LEFT){
    for(Cow c: particles){  
    c.click();
    }
  }
   //Read about mouseClicked()/mousePressed() and related methods in the documentation.
   //Right click: add a cow at the mouse location.
   //Left click: call the click of each cow 
}

void keyPressed() {
  if(key == ' '){
    particles.clear();
  }
  //Read about keyPressed() in the documentation.
  //hint:
  //println(keyCode);

}

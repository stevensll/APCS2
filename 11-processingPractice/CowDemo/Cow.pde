public class Cow {
  float x, y, dx, dy, radius;
  color c;
  boolean colliding;
  boolean selected;
  float xmultiplier, ymultiplier;
  float dmag, heading;
  Cow(float rad, float x, float y, float dx, float dy) {
    xmultiplier = 1;
    ymultiplier = 1;
    radius = rad;
    this.x = x;
    this.y = y;
    this.dx = (int)(dx*100)/100.0;
    this.dy = (int)(dy*100)/100.0;
    c = color(random(255),random(255),random(255));
  }
  Cow() {
    this(20+(int)(Math.random()*30), width/2, height/2, 
    random(6)-3,
    random(6)-3);
  }
  void updatePose(){
    dmag = dist(dx,dy,0,0);
    heading=atan2(dy,dx);
  }
  void move() {
    x += dx*xmultiplier;
    y += dy*ymultiplier;
    if (x >= width - radius || x <= radius) dx *= -1;
    if (y >= height - radius || y <= radius) dy *= -1;
  }
  void display() {
    if(this.colliding){
      stroke(0);
      fill(#FF0000,150);      
    } else {
      stroke(0,255);
      fill(c);
    }
    ellipse(x, y, radius*2, radius*2);
    if(this.selected){ 
          stroke(255);
          fill(255);
          ellipse(x-radius*.35, y-radius*.35,radius*.2,radius*.3 );
          ellipse(x+radius*.35, y-radius*.35,radius*.2,radius*.3);
          arc(x,y+radius*.15,radius,radius*.85,0,PI,CHORD);
          text("DX:" + dx + "\nDY:" + dy + "\nDMag:" + dmag + "\nHeading:" + degrees(heading),this.x+radius+5,this.y-10);
          //text("colliding"+colliding,this.x+radius+5,this.y-10);
      }
   if(this.selected && this.colliding){
     xmultiplier = 2;
     ymultiplier = 2;
   } else {
     xmultiplier = 1;
     ymultiplier = 1;
   }
  }
  void click(){
    if(dist(this.x,this.y,mouseX,mouseY) <= this.radius){
      //this.radius+=3;
      if(selected){
        selected = false;
      }else {
        selected = true;
      }
    }
  }

  void collide(ArrayList<Cow>others){
    for(Cow cow: others){
      if(this!=cow){  
        if(dist(this.x,this.y,cow.x,cow.y) <=(this.radius+cow.radius)){
          this.colliding = true;
          cow.colliding = true;
        } else colliding = false;
      }
    }
  }
  void turn(float angle){
    dx=dmag*cos(-radians(angle) + heading);
    dy=dmag*sin(-radians(angle) + heading);
  }
  void changeSpeed(float dv){
    dmag+=dv;
    dx=dmag*cos(heading);
    dy=dmag*sin(heading);
  }
}

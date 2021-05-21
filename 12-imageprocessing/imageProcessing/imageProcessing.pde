void setup(){
  size(1450,1450);
  PImage car = loadImage("redcar.jpg");
  PImage output = car.copy();
  Kernel k = new Kernel( new float[][]    { {-1, -1, -1},
     {-1, 8, -1},
   {-1, -1, -1} } );
  k.apply(car,output);
  imageMode(CENTER);
  image(output,725,725);
}

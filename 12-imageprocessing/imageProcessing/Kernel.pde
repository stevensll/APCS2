public class Kernel {
  float[][]kernel;

  /*Constructor takes the kernel that will be applied to the image
    This implementation only allows 3x3 kernels*/
  public Kernel(float[][]init) {
    kernel = init;
  }

  /*If part of the kernel is off of the image, return black, Otherwise
    Calculate the convolution of r/g/b separately, and return that color
  */
  color calcNewColor(PImage img, int x, int y) {
    float rd = 0;
    float g = 0;
    float b = 0;
    for(int r = 0; r < 3; r++){
      for(int c = 0; c < 3; c++){
        rd+=(kernel[r][c] * red(img.get(x+c-1,y+r-1)));
        g+=(kernel[r][c] * green(img.get(x+c-1,y+r-1)));
        b+=(kernel[r][c] * blue(img.get(x+c-1,y+r-1)));
      }
    }
    //Hint: start by always returning black.
    //This will let you test your apply method right away!
    return color(rd,g,b);
  }


  /*Assume the destination is the same dimensions as the source.

  */
  void apply(PImage source, PImage destination) {
    for(int r =0; r <source.height; r++){
      for(int c=0; c < source.width; c++){
         //set borders
         if(c == 0 || r == 0||r == source.height-1 || c== source.width-1) destination.set(c,r,0);
         else{
           destination.set(c,r,calcNewColor(source,c,r));
         }
      }
    }
  }

}

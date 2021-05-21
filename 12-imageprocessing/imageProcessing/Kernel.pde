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

    //Hint: start by always returning black.
    //This will let you test your apply method right away!
    return 3;
  }


  /*Assume the destination is the same dimensions as the source.

  */
  void apply(PImage source, PImage destination) {
    for(int r =0; r <source.height; r++){
      for(int c=0; c < source.width; c++){
         //set borders
         if(c == 0 || r == 0||r == source.height-1 || c== source.width-1) destination.set(c,r,0);
         else{
         
         
         }
      }
    }
  }

}

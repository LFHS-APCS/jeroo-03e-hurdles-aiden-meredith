/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase { 
    /** 
     * precondition: robot is facing east on the ground in front of 
     * hurdles made out of nets that are arbitrarily tall and far apart
     * postcondition: robot jumps the hurdles until it finds
     *                a flower on the ground
     **/

    public void hurdles()
    {
      while (!isFlower(HERE))
      {
    
         if (!isNet(AHEAD)){
           hop();
         } else {
            jump();
         }
    
  } 
}
public void jump() {
         turn(LEFT);

         while (isNet(RIGHT))
         {
           hop();
         }
         turn(RIGHT);
         hop();
         while (isNet(RIGHT))
         {
           hop();
         }
         turn(RIGHT);
         while (!isWater(AHEAD))
         {
           hop();
         }
         turn(LEFT);
}

    
       

    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}

//Take coordinates (x, y) and determine which quadrant the point lies in.

class A{
        public static void main(String[] args){
        int x = 0;
        int y = 0;
 
        if(x > 0 && y > 0)
           System.out.println("Quadrant I:Top Right");
        else if(x < 0 && y >0)
           System.out.println("Quadrant II:Top Left"); 
        else if(x < 0 && y < 0)
           System.out.println("Quadrant III:Bottom Left");
        else if(x > 0 && y < 0)
           System.out.println("Quadrant IV:Bottom Right");
        else if(x == 0 && y != 0)
           System.out.println("Y axis Quadrant point");
        else if(x != 0 && y == 0)
           System.out.println("x ais Quadrant point");
        else 
           System.out.println("Origin");

        }
}

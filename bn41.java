//Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

class A{
        public static void main(String[] args){
        int x = -1;
        int y = 0;

        if( x == 0 && y == 0)
           System.out.println("point is at the origin");
        else if(y == 0)
           System.out.println("the point lies on the X-axis");
        else if(x == 0)
           System.out.println("the point lies on the Y-axis");
        else
           System.out.println("the point lies in one of the quadrants");
     }
}             
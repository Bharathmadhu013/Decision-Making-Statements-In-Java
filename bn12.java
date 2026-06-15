//If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

class A{
        public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c = 10;
        if(a == b && b == c){
          System.out.println("Equilateral");
        }
        else if(a==b || b==c || a==c){
          System.out.println("Isosceles");
        }
        else{
          System.out.println("Scalene");
        }
    }
}
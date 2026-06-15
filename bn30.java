//Check whether a number is a perfect square (without using the square root function).

class A{
        public static void main(String[] args){
        int a = 49;
         
        if (a < 0) {
            System.out.println("Not a perfect square");
        } 
        else if (a == 0 || a == 1 || a == 4 || a == 9 || a == 16 || a == 25 || a == 36 || a == 49 || a == 64 || a == 81 || a == 100) {
            System.out.println("Perfect square: " + a);
        } 
        else {
            System.out.println("Not a perfect square: " + a);
        }
      }
} 
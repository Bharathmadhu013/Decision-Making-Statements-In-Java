
//Take a 3-digit number and check if all digits are distinct.

class A{
        public static void main(String[] args){
        int a1 = 111;
       
          if (a1 < 100 || a1 > 999) {
            System.out.println("Invalid input. Enter a 3-digit number.");
          }
          else {
            int a = a1 / 100;        // hundreds digit
            int b = (a1 / 10) % 10; // tens digit
            int c = a1 % 10;        // units digit

            if (a != b && b != c && a != c) 
                System.out.println("All digits are distinct.");
            else 
                System.out.println("Digits are not distinct.");
      }
   }
} 
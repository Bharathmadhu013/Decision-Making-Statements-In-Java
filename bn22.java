//Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.


class A{
        public static void main(String[] args){
        int a1 = 153;
        if (a1 < 100 || a1 > 999) {
            System.out.println("Invalid input. Enter a 3-digit number.");
        } 
        else {
            int a = a1 / 100;        // hundreds digit
            int b = (a1 / 10) % 10; // tens digit
            int c = a1 % 10;          // units digit

            if (b > a && b > c ) 
                System.out.println("Middle digit is the largest.");
            else if (b < a && b < c) 
                System.out.println("Middle digit is the smallest.");
            else 
                System.out.println("Middle digit is neither largest nor smallest.");

            }
        }
}

         
        
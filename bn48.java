// Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.


class A{
        public static void main(String[] args){
        int a = 5678;
        
        if(a >= 1 && a <= 9999){
           int a1 = a % 10;
           int a2 = (a / 10) % 10;
           int a3 = (a / 100) % 10;
           int a4 = (a / 1000) % 10;

           int sum = a1 + a2 + a3 + a4;
           int product = a1*a2*a3*a4;
         
           if(sum > product)
              System.out.println("Sum is Greater than the Product");
           else 
              System.out.println("Sum is Not Greater than the Product");
         }
         else{
              System.out.println("Invalid Input");
         }
    }
}



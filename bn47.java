//Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.


class A{
        public static void main(String[] args){
        int a = 121 ; 
   
        if(a >= 100 && a <= 999){
           int a1 = a / 100;
           int a2 = ( a / 10) % 10;
           int a3 = a % 10;
   
        if(a1 + a3 == a2){
           System.out.println("Satisfied");
        }
        else{
           System.out.println("Not Satisfied");
        }
      }
      else{
           System.out.println("Invalid Input");
      }
  }
}
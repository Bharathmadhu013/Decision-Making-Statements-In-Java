//Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

class A{
        public static void main(String[] args){
        double i = 600000;
        int a = 19;
 
        if(a > 18 && i > 500000){
           System.out.println("eligible for tax");
        }
        else{
           System.out.println("Not eligible for tax");
         }
     }
}
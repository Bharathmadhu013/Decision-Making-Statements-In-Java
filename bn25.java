//Check if a number is a multiple of 7 or ends with 7

class A{
       public static void main(String[] args){
       int a = 15;
       int a1 = a % 10;

       if(a % 7 == 0 || a1 == 7)
          System.out.println("a number is a multiple of 7 or ends with 7");
       else 
          System.out.println("a number is a not multiple of 7 or ends with 7");
     }
}
          

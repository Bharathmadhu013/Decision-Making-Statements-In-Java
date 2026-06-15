//Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.

class A{
       public static void main(String[] args){
       int a = 'm';
       if(a>'A' && a<'Z'){
          System.out.println("uppercase");
       }
       else if(a>'a' && a<'z'){
          System.out.println("lowercase");
       }
       else if(a>'0' && a<'9'){
          System.out.println("Digits");
       }
       else{
          System.out.println("Special charater");
       }
   }
}
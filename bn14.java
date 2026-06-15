//Check if one of two given numbers is a multiple of the other.

class A{
       public static void main(String[] args){
       int a = 10;
       int b = 01;
       if((a % b)==0 || (b % a) == 0){
          System.out.println("Yes,one of two given numbers is a multiple of the other");
       }
       else{
          System.out.println("no,one of two given numbers is a multiple of the other");
       }
    }
}
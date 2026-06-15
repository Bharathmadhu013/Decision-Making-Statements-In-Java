//Take a temperature value and print Cold,Warm, or Hot using range conditions.

class A{
       public static void main(String[] args){
       int a = 1;
       if(a<20){
          System.out.println(a + " is cold temperature range condition");
       }
       else if(a>20 && a<40){
         System.out.println(a + " is warm temperature range condition");
       }
       else{
          System.out.println(a + " is Hot temperature range condition");
       }
    }
}

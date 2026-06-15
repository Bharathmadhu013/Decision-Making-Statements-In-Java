//Take a weekday number (1–7) and determine if it is a weekday or weekend.

class A{
        public static void main(String[] args){
        int a = 0;
        
        if(a >= 1 && a <= 5)
           System.out.println(a + " WeekDay");
        else if(a >= 6 && a <= 7)
           System.out.println(a + " WeekEnd");
        else
           System.out.println("it is Not a weekday or weekend");

     }
}
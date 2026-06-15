//Take two dates (day and month) and determine which one comes first in the calendar.

class A{
        public static void main(String[] args){
        int a1 = 16, b1 = 05;//a = day
        int a2 = 10, b2 = 05;//b = month 

        if(b1 < b2){
           System.out.println("first date comes earlier");
        }
        else if(b1 > b2){
           System.out.println("second date comes earlier");
        }
        else{
            if(a1 < a2)
                System.out.println("first date comes earlier");
            else if(a1 > a2)
               System.out.println("second date comes earlier");
            else 
               System.out.println("Both dates are same");
        }
    }
}
        

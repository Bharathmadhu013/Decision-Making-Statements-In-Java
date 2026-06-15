//Take the hour of the day (0–23) and print Good Morning, Good Afternoon, Good Evening, or Good Night.

class A{
        public static void main(String[] args){
        int a = 10;
        if(a>6 && a<11){
           System.out.println("Good Morning");
        }
        else if(a>11 && a<17){
           System.out.println("Good Afternoon");
        }
        else if(a>17 && a<23){
           System.out.println("Good Evening");
        }
        else{
           System.out.println("Good Night");
        }
     }
}
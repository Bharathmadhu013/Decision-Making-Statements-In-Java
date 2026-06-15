//Take three numbers and print the median value (neither maximum nor minimum).

class A{
        public static void main(String[] args){
        int a = 1;
        int b = 4;
        int c = 3;
     
        if((a >= b && a <= c) ||(a >= c && a <= b))
           System.out.println(a + " is the median value");

        else if((b >= a && b <= c) || (b >= c && b <= a))
           System.out.println(b + " is the median value");

        else
           System.out.println(c + " is the median value");
     }
} 
          
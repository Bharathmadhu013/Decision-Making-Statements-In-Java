//Check if Check if a number is divisible by both 3 and 5..

class A{
        public static void main(String[] args){
        int a = 15;
        if((a % 3) == 0 && (a % 5) == 0){
           System.out.println(a + " a number is divisible by both 3 and 5");
        }
        else if((a % 3) == 0){
           System.out.println(a + " a number is divisible by both 3");
        }
        else if((a % 5) == 0){
           System.out.println(a + " a number is divisible by both 5");
        }
        else{
           System.out.println(a + " a number is not divisible by both 3 and 5");
        }
    }
}



           
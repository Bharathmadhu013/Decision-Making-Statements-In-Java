//Take three numbers and print the larger.

class A{
        public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 20;
        if(a>=b && a>=c){
           System.out.println(a + " large no");
        }
        else if(b>=c && b>=a){
           System.out.println(b + " large no");
        }
        else{
           System.out.println(c + " large no");
        } 
    }
}
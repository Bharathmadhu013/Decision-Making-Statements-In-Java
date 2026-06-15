//Take three sides and check if they form a valid triangle.

class A{
        public static void main(String[] args){
        int a = 4;
        int b = 5;
        int c = 3;
        if((a+b>c) && (a+c>b) && (c+b>a)){
           System.out.println("valid");
        }
        else{
          System.out.println("not valid");
        }
     }
}



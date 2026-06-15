//Take three numbers and check if they can form a Pythagorean triplet.

class A{
        public static void main(String[] args){
        int a = 3;
        int b = 4;
        int c = 5;
        
        if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a))
           System.out.println("a Pythagorean triple");
        else
           System.out.println("not a Pythagorean triplet");
   }
}
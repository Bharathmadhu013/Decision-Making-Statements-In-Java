//Take a character and check if it is a letter, a digit, or neither.

class A{
        public static void main(String[] args){
        char a = '*';

        if(a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z')
           System.out.println(a + " it is a letter");
        
        else if(a >= '0' && a <= '9')
           System.out.println(a + " it is a digits");
        
        else
           System.out.println(a + " it is a neither");
     }
}
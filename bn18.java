//Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.


class A{
        public static void main(String[] args){
        char ch = 'a';
        if(ch>='a' && ch<='m')
           System.out.println("true");
        else if(ch>='n' && ch<='z')
           System.out.println("false");
        else
           System.out.println("not a character");
      }
}
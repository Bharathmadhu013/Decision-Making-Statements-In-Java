//Check whether a given integer is single-digit, double-digit, or multi-digit.

class A{
        public static void main(String[] args){
        int a = 040;

        if(a<0){
         a = -a;
        }

        if(a>=0 && a<=9)
          System.out.println(" a given integer is single-digit");
        else if(a>=10 && a<=99)
          System.out.println(" a given integer is double-digit");
        else
          System.out.println(" a given integer is multi-digit");
      }
}

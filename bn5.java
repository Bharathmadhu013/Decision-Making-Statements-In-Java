//Check if a given year is a leap year.

class A{
        public static void main(String[] args){
        int a = 2022;
        if((a % 4)==0 && (a % 100) != 0 ||(a % 400) == 0){
         System.out.println(a + " Given year is a leap year");
        }
        else{
             System.out.println(a + " Given year is not a leap year");
         }
    }
}
//Take a 4-digit number and check if the first and last digits are equal.

class A{
        public static void main(String[] args){
        int a = 1341;
        
        if(a < 1000 || a > 9999){
           System.out.println("Invalid Input");
        }
        else{
        int a1 = a / 1000;
        int a2 = a % 10;
        
        if(a1 == a2)  
           System.out.println("First & Last digits are Equal");
        else
           System.out.println("First & Last digits are  Not Equal");
       }
    }
}

 
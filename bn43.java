//Take day and month and check if it forms a valid calendar date (ignoring leap years).

class A{
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        if (b < 1 || b > 12) 
            System.out.println("Invalid Date");
        
        else 
            if (b == 2) {
                if (a >= 1 && a <= 28) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date");
                }
            } 

            else if (b == 4 || b == 6 || b == 9 ||b == 11) {
                if ( a >= 1 && a <= 30) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date");
                }
            } 
            else {
                if (a >= 1 && a <= 31) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date");
                }
            }
        
    }
}
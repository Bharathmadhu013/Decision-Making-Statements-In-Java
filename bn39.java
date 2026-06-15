//Take electricity units consumed and calculate the bill as per slabs (using if-else).

class A{
    public static void main(String[] args) {
        int units = 350;
        double bill = 0;

        if (units <= 100) {
            bill = units * 1;
        } 
        else if (units <= 200) {
            bill = (100 * 1) + (units - 100) * 2;
        } 
        else if (units <= 300) {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        } 
        else {
            bill = (100 * 1) + (100 * 2) + (100 * 3) + (units - 300) * 5;
        }

        System.out.println("Total Bill: " + bill);
    }
}    
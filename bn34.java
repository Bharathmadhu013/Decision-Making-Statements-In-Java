//Take 24-hour time (hours and minutes) and print whether it is AM or PM.
import java.util.*;
class A {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour >= 0 && hour < 12) {
            System.out.println("AM");
        } 
        else if (hour >= 12 && hour < 24) {
            System.out.println("PM");
        } 
        else {
            System.out.println("Invalid Time");
        }
    }
}
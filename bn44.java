//Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

class A{
    public static void main(String[] args) {
        int a = 12; // a = hour
        int b = 30; // b = minute

        
        if (a == 12) {  // Convert 12-hour format
            a = 0;
        }
        
        // a1 = hourangle
        // b1 = minuteangle
        // c = angle
        double b1 = 6 * b;
        double a1 = 30 * a + 0.5 * b;

        double c = a1 - b1;

        
        if (c < 0) { // Absolute value without Math.abs()
            c = -c;
        }

        
        if (c > 180) { // Smaller angle
            c = 360 - c;
        }

        System.out.println("Angle: " + c + " degrees");
    }
}
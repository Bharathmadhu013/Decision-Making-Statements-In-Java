//Take a password string and check basic rules (length ≥ 8 and contains at least one digit)



import java.util.Scanner;
class A{
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     
        String a = sc.next() ; //inupt:Nikki@1705 
        int b =  a.length();

        if (b >= 8) {
            boolean c = false;

          
            if (a.charAt(0) >= '0' && a.charAt(0) <= '9')c = true;
            else if (a.charAt(1) >= '0' && a.charAt(1) <= '9') c = true;
            else if (a.charAt(2) >= '0' && a.charAt(2) <= '9') c = true;
            else if (a.charAt(3) >= '0' && a.charAt(3) <= '9')c = true;
            else if (a.charAt(4) >= '0' && a.charAt(4) <= '9') c = true;
            else if (a.charAt(5) >= '0' && a.charAt(5) <= '9') c = true;
            else if (a.charAt(6) >= '0' && a.charAt(6) <= '9') c = true;
            else if (a.charAt(7) >= '0' && a.charAt(7) <= '9') c = true;

            if (c) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid: No digit");
            }

        } else {
            System.out.println("Invalid: Length less than 8");
        }
    }
}
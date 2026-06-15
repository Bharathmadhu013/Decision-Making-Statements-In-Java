//Take marks (0–100) and print the corresponding grade (A/B/C/D/E).

class A{
       public static void main(String[] args){
       int a = 24;
       if(a<100 && a>90){
          System.out.println("A");
       }
       else if(a<90 && a>80){
          System.out.println("B");
       }
       else if(a<80 && a>70){
          System.out.println("C");
       }
       else if(a<70 && a>65){
          System.out.println("D");
       }
       else if(a<65 && a>35){
          System.out.println("E");
       }
       else{
           System.out.println("Fail");
       }
    }
}
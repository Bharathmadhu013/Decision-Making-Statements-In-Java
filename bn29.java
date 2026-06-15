//Take two angles of a triangle and compute the third angle.

class A{
        public sta tic void main(String[] args){
        int a = 60;
        int b = 65;
        int sum = a + b;
        
        int c = 180-sum;

        if(sum >= 180)
           System.out.println("The third angle is 80 not Equal");
        else
           System.out.println("The third angle is : " + c);
      }
}
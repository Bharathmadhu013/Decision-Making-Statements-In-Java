//Take a year and print the corresponding century (e.g., "19th century", "20th century").

class A{
        public static void main(String[] args){
        int a = 2001;//a = year , b = centery
 
        if(a>0){
         int b = (a - 1)/100 + 1;
         
        String Suffix;
        if(b % 100 >= 11 && b % 100 <= 13){
           suffix = "th";
        }
        else if(b % 10 == 1){
           suffix = "st";
        }
        else if(b % 10 == 2){
           suffix = "nd";
        }
        else if(b % 10 == 3){
           suffix = "rd";
        }
        else{
           suffix = "th";
        }
        System.out.println(b + suffix + "b");
        }
        else{
        System.out.println("Invalid Input");
        }
   }
}

           
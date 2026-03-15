public  class JavaTask15 {
    public static void main(String[] args) {
 
        int number = 324567;
        int sum = 0;
     while (number > 0) {
    int digit = number % 10;

    if (digit % 2 != 0) 
    sum += digit;
  

    number = number / 10;
}
         System.out.println("The sum of all even digits is "+sum);
    }
        
 
 
 

    }


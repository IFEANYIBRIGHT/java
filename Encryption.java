import java.util.Scanner;
public class Encryption{
      public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
         int sum = firstNumber + 7;
            int divide = sum %10;
         

      System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        int sum2 = secondNumber + 7;
         int divide2 = sum2 / 10;
         

        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();
          int sum3 = thirdNumber + 7;
         int divide3 = sum3 / 10;
          

        System.out.println("Enter fourth number");
        int fourthNumber = input.nextInt();
        int sum4 = fourthNumber + 7;
        int divide4 = sum /10;
        
 System.out.printf("%d %d %d %d",divide,divide3,divide2,divide4);
System.out.println();
  
          
         
       

      


         
}



}







import java.util.Scanner;
public class Largest2{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
       
        int count = 0;
        int secondLargest = firstNumber;
       int largest = firstNumber;
        int thirdLargest = firstNumber;
        while(count < 5){         
      firstNumber = input.nextInt();
        

        if(firstNumber > largest){
        secondLargest = largest;
        largest = firstNumber;
         
        
        
}
count++;

} System.out.printf("%d is the largest%n", largest);
System.out.printf("%d is the second largest%n", secondLargest);
 
 System.out.println();



}



}

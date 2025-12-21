import java.util.Scanner;
public class Largest{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        
          int largest = firstNumber;
            int count =1;
          
            while(count <= 10){
        firstNumber = input.nextInt();
        if(firstNumber > largest){
        largest = firstNumber; 
       

        }
     count++;
}
           System.out.printf( "%d is the largest %n",largest );
           

        


 








}
}

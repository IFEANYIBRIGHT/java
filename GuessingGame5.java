import java.util.Scanner;
import java.util.Random;
public class GuessingGame5{
    public static void main(String...args){
    Scanner inputcollector = new Scanner(System.in);
    Random input = new Random();
 
        int guessCounter = 0;
    int number =input.nextInt(20)+1;
       while(true){
    System.out.println("Guess a number from 1 - 20 ");
     int guessNumber = inputcollector.nextInt();
  
   
if(guessNumber != number){
    System.out.println("You are almost correct but the correct number is  "+number);
System.out.println();
}else{
    System.out.println("You are correct");
System.out.println();
}    

 if(guessNumber > number){
System.out.println("Too High");
}else{

System.out.println("Too low");
System.out.println();
}

 guessCounter++;


System.out.println("U guessed  "+ guessCounter+" times");
}















}






}


























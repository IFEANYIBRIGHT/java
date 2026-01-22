import java.util.Scanner;
import java.util.Random;
public class GuessingGame3{
    public static void main(String...args){
    Scanner inputcollector = new Scanner(System.in);
    Random input = new Random();

    int number =input.nextInt(20)+1;
    
    System.out.println("Guess a number from 1 - 20 ");
    int guessNumber = inputcollector.nextInt();
    
    if(guessNumber != number){
    System.out.println("You are almost correct but the correct number is  "+number);
}else{
    System.out.println("You are correct");
}    

 if(guessNumber > number){
System.out.println("Too High");
}else{

System.out.println("Too low");
}























}
























}

import java.util.Scanner;
public class ComparisonTwice{
    public static void main(String[]args){
    scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    System.out.print("Enter second integer: ");
    int secondNumber = input.nextInt();
    if(number1 == number2){
    System.out.printf("%d == %d%n", number1, number2);
    }

    if(number1 != number2){
    System.out.printf("%d < %d%n", number1, number2);
    }

    if(number1 < number2){
    System.out.printf("%d < %d%n", number1, number2);
    }

    if(number1 > number2){
    System.out.printf("%d > %d%n", number1, number2);
    }

    if(number1 <= number2){
    System.out.printf("%d <= %d%n", number1, number2);
    }
    if(number1 <= number2){
    System.out.print("%d >= %d%n", number1, number2);  
    }
  }   
}





//
// int number = 7;   
//int number1 = 1;
//if(number > 0){
//System.out.println("Number is negative  ");
//}
//while(number < 7){
//System.out.print("Number is positive");
//number++;
//}
//}

//}
    
    //Scanner input = new Scanner(System.in);
//    int count = 0;
//    int number = 0;
//    int largest = 10;
//
//while(count <= 10){
//System.out.println("Enter number ");
//if(number > largest){
//    largest = number;
//count++;
//}
//System.out.println("The largest number is: "+ largest);
//
//



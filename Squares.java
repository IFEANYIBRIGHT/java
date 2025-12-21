import java.util.Scanner;
public class Squares{
public static void main(String... args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter  number:");
        int number = input.nextInt();
        
        int squared = number * number;
        System.out.printf("The squares of the number  is %d%n", squared);

    if(squared >= 100)
    System.out.println("The number is greater than 100");
    if (squared == 100){
        System.out.println("The number is equal to  100");
}   if(squared != 100){
        System.out.println("The number is not equal to  100");

}   if(squared < 100){
        System.out.println("The number is less than  100");

}

    
}


}


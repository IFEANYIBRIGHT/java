import java.util.Scanner;
public class Comparator{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        
    
        if(firstNumber == secondNumber)
        System.out.println("0");

        if(firstNumber > secondNumber)
        System.out.println("1");
        
        if(secondNumber > firstNumber)
            System.out.println("-1");
    
    


}





}

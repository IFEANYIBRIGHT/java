import java.util.Scanner;
public class Extremes{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
     System.out.println("Enter number with sense oo:");
    int num1 = input.nextInt();
     
    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;
     int counter = 0;   
    while(counter < num1){
    System.out.println("Enter ur number");
    int number = input.nextInt();
    
    if(number > maximum){
    maximum = number;
    }
    if(number > minimum){
}   minimum = number;

    counter++;
    }
System.out.printf("%d is the maximum%n",maximum);
 System.out.printf("%d is the minimum%n",minimum);
       


}

}

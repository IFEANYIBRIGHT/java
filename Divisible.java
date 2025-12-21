import java.util.Scanner;
public class Divisible{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
//     System.out.println("Enter number with sense oo:");
//    int num1 = input.nextInt();
 int num1 = 0;
    for(int counter = 1;counter <= 30;counter++){
    num1 += counter;
    
if(num1 % 2 == 1 )  

 System.out.println(num1);
}

}
}

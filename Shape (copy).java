import java.util.Scanner;
public class Shape{
        public static void main(String... args){        

        Scanner inputcollector = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int rectangle = inputcollector.nextInt();
        
        System.out.println("Enter Width: ");    

        int width = inputcollector.nextInt();

        int area = rectangle * width;

        System.out.printf("Area is known as %d:", + area);    



}



}

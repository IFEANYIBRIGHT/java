import java.util.Scanner;
public class Gasmilage{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mile driven:");
        int mileDriven = input.nextInt(); 
        
        int milesPerGallon = 0;
        while(milesPerGallon <= mileDriven){ 
        
        System.out.println("Enter gallons used");    
        int gallonsUsed = input.nextInt();

         int total = milesPerGallon + gallonsUsed;
    
        System.out.printf("The combined miles per gallon is %d%n",total);     
           double average = (double) total / 2;
        System.out.printf("The averaging calculations is %.2f%n",average);
        milesPerGallon++;
        }




}







}

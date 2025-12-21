//collect trip driven
//colleiven
//collect gallon
//
//use for loop for trip driven
//sum up milesdriven and gallon usedct milesdr
//average tripdriven
//

import java.util.Scanner;
public class Exercise{
public static void main(String... args){
    Scanner input = new Scanner(System.in);
       System.out.println("Enter trip driven:");
        int tripDriven = input.nextInt();
        
        int trip = 0;
        int milesPerGallon = 0;
while(trip <= tripDriven ){          
        System.out.printf("The trip so far is %d%n ",trip);
        trip++;
        System.out.println("Enter miles driven:");
        int milesDriven = input.nextInt();
        
        System.out.println("Enter gallon used:");
        int gallonUsed = input.nextInt();
        milesPerGallon += milesDriven;
          
         double average = (double) tripDriven /3;
System.out.printf("The average of trip  is %2.f%n",average);
          }












}











}

import java.util.Scanner;
public class MortgageCalculator{
        public static void main(String... args){

        Scanner input = new Scanner(System.in);
     
        while(true){        
          
        System.out.println("Enter principal Amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter the annual interest rate:");
        double interestRate = input.nextDouble();

        
           System.out.println("Enter the duration in years:");
        double duration = input.nextDouble();
        
     double rate = interestRate /(100 *12);
        
 
    double payment = amount * (rate * (Math.pow(1 + rate,duration * 12))/(Math.pow(1 + rate ,duration * 12)-1));

System.out.printf("Your montly payment is %.2f " ,payment);
 System.out.println();



            System.out.println("To reconfirm u ,do you want Re-enter ur detail yes or no");
            String details =  input.next();
    if(details.equalsIgnoreCase("no")){           
 

 
break;



    


}

}

}



















}




































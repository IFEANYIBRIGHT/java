import java.util.Scanner;
public class FinancialApplication{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter loan amount: ");
double principalAmount = input.nextDouble();

System.out.print("Enter duration in years: ");
double years = input.nextDouble();


System.out.println("Interest interestRate\t\t  Monthly Payment\t\tTotal Payment");

for(double interestRate = 5.0; interestRate <= 10.0; interestRate += 0.25){



double monthlyIntinterestRate = interestRate / 1200;

double noOfMonths = years * 12;


double monthlyPayment = (principalAmount * monthlyIntinterestRate) / (1 - Math.pow(1 + monthlyIntinterestRate, -noOfMonths)); 

double totalPayment = monthlyPayment * noOfMonths;



System.out.printf("%.2f \t\t ₦%.2f  \t\t₦%.2f⁪", interestRate, monthlyPayment, totalPayment);

System.out.println();
}
}

}

//ask for account number;
//ask for balance for the beginning of the month
//ask for totals of items charged of the month
//"  "  "     "       applied by th customer this month
//allowed credit limit 
import java.util.Scanner;
public class CreditLimitCalculator{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
        System.out.println("Enter account number:");
        long accountNumber = input.nextLong();
 
        System.out.println("What's ur balance at the beginning of the month:");
        int balance = input.nextInt();
        
        System.out.println("Enter totals of items charged this month:");
        int totalCharged = input.nextInt();
         
        System.out.println("Enter total of all credits applied to the customer's'account this month:");
        int credits = input.nextInt();

        if(credits >= 10000)
        System.out.println("Credit exceeded");
        else
         System.out.println("Credit not  exceeded, ur transaction is smooth");
        
        int eachCustomer = 0;
         int counter = 0;
        while(counter <= eachCustomer ){
          counter++;
}
        System.out.println(eachCustomer); 


        
        




}





} 

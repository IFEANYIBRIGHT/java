import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 0.0;
        ArrayList<String> transactions = new ArrayList<>();

        while(true){
            String menu = """
WELCOME CUSTOMER, WHAT WOULD YOU LIKE TO DO TODAY?
1. Deposit Money
2. Withdraw Money
3. Show Transaction History
4. Exit The Program
""";
            System.out.println(menu);
            System.out.print("What do you want to do? ");
            int choice = input.nextInt();
            input.nextLine();  

            if(choice == 1){
                System.out.print("How much do you want to deposit?:");
                double deposit = input.nextDouble();
                input.nextLine(); 

                balance += deposit;
                String funds = String.format("You deposited #%.2f ,New Balance #%.2f", deposit, balance);
                transactions.add(funds);
                System.out.println(funds);

            } else if(choice == 2){
                System.out.print("How much do you want to withdraw? ");
                double withdraw = input.nextDouble();
                input.nextLine();

                if(withdraw > balance){
                    System.out.println("Insufficient funds!");
                    transactions.add(String.format("Failed withdrawal: #%.2f", withdraw));
                } else {
                    balance -= withdraw;
                    String funds = String.format("You withdrew #%.2f ,New Balance #%.2f", withdraw, balance);
                    transactions.add(funds);
                    System.out.println(funds);
                }

            } else if(choice == 3){
                System.out.print("Would you like to see your transaction history? (yes/no): ");
                String decide = input.nextLine();

                if(decide.equalsIgnoreCase("yes")){
                    if(transactions.isEmpty()){
                        System.out.println("No transactions yet.");
                    } else {
                        System.out.println("All Transactions:");
                        for(int counter = 0; counter < transactions.size(); counter++){
                            System.out.println((counter + 1) + ". " + transactions.get(counter));
                        }
                        System.out.println();
                    }
                }

            } else if(choice == 4){
                System.out.printf("Final Balance: #%.2f%n", balance);
                System.out.println("Thank you for using Transactions Log App!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}


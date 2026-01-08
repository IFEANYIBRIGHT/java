import java.util.Scanner;
import java.util.ArrayList;

public class Ecocommerce {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> unitPrices = new ArrayList<>();

        System.out.print("Customer name: ");
        String customer = input.nextLine();
 
        while (true) {

            System.out.print("What did customer buy? ");
            items.add(input.nextLine());

            System.out.print("How many pieces? ");
            quantities.add(input.nextInt());

            System.out.print("Price per unit? ");
            unitPrices.add(input.nextDouble());
            input.nextLine();  

            System.out.print("Add more items? (yes/no): ");
            String more = input.nextLine();

            if (more.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.print("Cashier name: ");
        String cashier = input.nextLine();

        System.out.print("Discount percentage: ");
        double discountPercent = input.nextDouble();
        input.nextLine();

        System.out.print("Time: ");
        String time = input.nextLine();

        System.out.print("Date: ");
        String date = input.nextLine();

       
        double subTotal = 0;
        String receiptBody = "";

        for (int i = 0; i < items.size(); i++) {

            double total = quantities.get(i) * unitPrices.get(i);
            subTotal += total;

            receiptBody += String.format(
                "%-15s %5d %12.2f %12.2f%n",
                items.get(i),
                quantities.get(i),
                unitPrices.get(i),
                total
            );
        }

        double discountAmount = subTotal * (discountPercent / 100.0);
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discountAmount + vat;

   
        System.out.printf("""
        ================== SEMICOLON STORES ==================
        LOCATION: 312 Herbert Macaulay Way, Sabo Yaba, Lagos
        TEL: 08131913381

        DATE: %s
        TIME: %s
        CASHIER: %s
        CUSTOMER: %s
        ------------------------------------------------------
        ITEM              QTY        PRICE        TOTAL
        ------------------------------------------------------
        %s
        ------------------------------------------------------
                             SUBTOTAL:     %.2f
                             DISCOUNT:     %.2f
                             VAT (7.5%%):   %.2f
        ======================================================
                             BILL TOTAL:   %.2f
        ======================================================
        """,
        date, time, cashier, customer,
        receiptBody,
        subTotal, discountAmount, vat, billTotal
        );

        input.close();
    }
}


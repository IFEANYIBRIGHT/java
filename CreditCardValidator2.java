 import java.util.Scanner;

    public class CreditCardValidator2{
        
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
           
            System.out.print("Enter your Credit card number: ");
            String creditCardNumber = input.next();
            

            int length = creditCardNumber.length();
            int sumOfEven = 0;
            int sumOfOdd = 0;
            String cardType = "Invalid card";
            String validityStatus = "Invalid";

            for(int count = length - 2; count >= 0; count-= 2){ 
               int number = creditCardNumber.charAt(count) - '0';
               number += number;
                if(number > 9) number -= 9;
                sumOfEven+= number;
            }


            for(int count = length - 1; count > 0; count-= 2){   
               int number = creditCardNumber.charAt(count) - '0';
                sumOfOdd+= number;
            }
            int sum = sumOfEven + sumOfOdd;
            if (sum % 10 == 0) validityStatus = "Valid";
            if (creditCardNumber.charAt(0) == '4') cardType = "Visa Card";
            else if (creditCardNumber.charAt(0) == '5') cardType = "Master Card";
            else if (creditCardNumber.charAt(0) == '6') cardType = "Discover Card";
            else if (creditCardNumber.charAt(0) -'0' + creditCardNumber.charAt(1) - '0'== 37) 
                    cardType = "American Express Card";
            System.out.println("Credit Card Type: " + cardType );
            System.out.println("Credit Card Number: " + creditCardNumber);
            System.out.println("Credit Card Length: " + length);
            System.out.println("Credit Card Validity Status: " + validityStatus);
}



}

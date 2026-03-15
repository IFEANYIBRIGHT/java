//FUNCTION validateCreditCard(inputString):
//    
//    // STEP 1: Sanitization
//    // Remove any spaces or dashes the user might have entered
//    cardNumber = removeNonDigits(inputString)
//    
//    // Basic length check (most cards are between 13 and 19 digits)
//    IF length of cardNumber < 13 OR length > 19:
//        RETURN False
//    
//    // STEP 2: Setup Variables
//    totalSum = 0
//    isSecondDigit = False
//    
//    // STEP 3: The Luhn Loop (Process from Right to Left)
//    // We start at the end because the right-most digit is the "Check Digit"
//    FOR i FROM (length of cardNumber - 1) DOWN TO 0:
//        
//        // Convert the character to an actual integer
//        currentDigit = convertToInteger(cardNumber[i])
//        
//        IF isSecondDigit is True:
//            // Double the digit
//            currentDigit = currentDigit * 2
//            
//            // If doubling results in a number > 9 (like 14), 
//            // add the digits (1+4=5) or just subtract 9 (14-9=5)
//            IF currentDigit > 9:
//                currentDigit = currentDigit - 9
//        
//        // Add the result to our running total
//        totalSum = totalSum + currentDigit
//        
//        // Flip the boolean switch so we only double every other number
//        isSecondDigit = NOT isSecondDigit
//        
//    // STEP 4: Final Validation
//    // If the total sum is divisible by 10, the card is valid
//    IF (totalSum MODULO 10) IS 0:
//        RETURN True
//    ELSE:
//        RETURN False
//
//
import java.util.Scanner;
public class  CreditCard{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);

    System.out.println("Enter ur account number:");
    String number = input.next();
    boolean number = true;
    
    for(char:number.to charArray()){
    if(!charactern isDigit())
        number = false;     
      }  
     if((number.length() < 13 || number.length() > 16)&&(number == true))   {

    if(number.startsWith("4")){

    System.out.println("Visa card");
    }
    if(number.startsWith ("5"));{
    System.out.println("Master card");
}
    if(number.startsWith ("37")){
    System.out.println("American Express Cards");
    }
    if(number.startsWith ("6")){
       System.out.println("Discover cards");
        }





}






}

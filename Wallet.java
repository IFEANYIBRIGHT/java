import java.util.Scanner;
public class Wallet{

    public static boolean luhnAlgorithm(String cardNumber){
           
    String result = " ";
    String validity = "Valid";
    String invalidCard = " invalid";

    String cardType = " ";
    String visaCard = " Visa Cards";
    String masterCard = "Master Card";
    String americanCard = "American Express Card";
    String Discover = "Discover Cards";

    int totalSum = 0;
    int doubledNumber = 0;
  
 
    
    for(int count = cardNumber.length() -1;count > 0 ;count -=2){
 
   int digit = cardNumber.charAt(count) - '0';
    
     totalSum += count;
    if(count - 1 >= 0){
    int secondDigit = cardNumber.charAt(count - 1) - '0';

      doubledNumber = secondDigit * 2 ;

    if(doubledNumber > 9){
        doubledNumber -= 9;
        } 
 
    }
     if(totalSum % 10 == 0){
        result = validity;

    
    }else{
        result = invalidCard;

        }
    
       



    if(cardNumber.startsWith("4")){
     cardType = visaCard;
    }

    else if(cardNumber.startsWith("5")){
    cardType = masterCard;

    }
    else if(cardNumber.startsWith("34") || cardNumber.startsWith("37")){
    cardType = americanCard;

    }
    else if(cardNumber.startsWith("6")){
    cardType = Discover;

    }
    
        }
    return  true ;

    


}

   
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        
            System.out.println("Welcome To The Ticketing App !! ");
            
            System.out.println(); 
         
            System.out.println("To buy Ticket input ur card number ");
            String cardNumber = input.nextLine();
            
             System.out.println("input Card Exipery Date (mm/dd/yy) ");
            String cardDate  = input.nextLine();

            int length = cardNumber.length();

            if(length < 13 || length > 19){
            System.out.println("Invalid card number");


            }else{
            System.out.println(luhnAlgorithm(cardNumber));

            }






    }
























}

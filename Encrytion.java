import java.util.Scanner;
public class Encrytion{
      public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text :");
        String text = input.nextLine();
    
         System.out.println("Enter number :");
        int number = input.nextInt();
        
        number = number % 26;
            
        String result = "";
        
        for(int count  = 0;count < text.length();count++){
        char letter = text.charAt(count);

        if(letter >= 'A' && letter <= 'Z')
         int encrypt = letter - 'A';
         char newPosition = (encrypt + number)% 26;
          char encrypted = (char)(newPosition  - 'Z');
    
    } 

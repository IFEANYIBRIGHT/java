import java.util.Scanner;

public class CipherCeasar {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to Encrypt or Decrypt?");
        String ask = input.nextLine();
    
        

        System.out.println("Enter text:");
        String text = input.nextLine();

        System.out.println("Enter shift:");
        int shift = input.nextInt();

        shift = shift % 26;    
        String result = "";

        for (int count = 0; count < text.length(); count++) {
            char letter = text.charAt(count);

            if (letter >= 'A' && letter <= 'Z') {
                int position = letter - 'A';
                int newPosition;

                if (ask.equalsIgnoreCase("encrypt")) {
                    newPosition = (position + shift) % 26;
                } else {
                    newPosition = (position - shift + 26) % 26;
                }

                char newChar = (char) (newPosition + 'A');
                result += newChar;
            }

            else if (letter >= 'a' && letter <= 'z') {
                int position = letter - 'a';
                int newPosition;

                if (ask.equalsIgnoreCase("encrypt")) {
                    newPosition = (position + shift) % 26;
                } else {
                    newPosition = (position - shift + 26) % 26;
                }

                char newChar = (char) (newPosition + 'a');
                result += newChar;
            }

            else {
                result += letter;  
            }
        }

        if (ask.equalsIgnoreCase("encrypt")) {
            System.out.println("Encrypted text: " + result);
        } else {
            System.out.println("Decrypted text: " + result);
        }
    }
}


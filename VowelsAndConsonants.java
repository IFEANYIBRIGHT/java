import java.util.Scanner;
public class VowelsAndConsonants{
    public static void main(String...args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters :");
        String characters = input.nextLine();
        
        int vowelCounter = 0;
        int consonants = 0;

        for(int count = 0; count < characters.length();count++){
        char alphabets = characters.charAt(count);
    
            if(alphabets == 'a' || alphabets == 'A' || alphabets == 'e' || alphabets == 'E'|| alphabets == 'i' ||alphabets == 'I' || alphabets == 'o'|| alphabets == 'O'|| alphabets == 'U' || alphabets == 'u'){
    vowelCounter ++;

    }else{

consonants++;
}
}    
    System.out.println("Number of consonant is  "+consonants);
    
        System.out.println("Number of vowels is  "+(VowelCounter);
    

    }























}

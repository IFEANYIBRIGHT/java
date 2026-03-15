import java.util.Scanner;
public  class JavaTask10 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Check if number is palindrome");
        int number = input.nextInt();
    
        String word = ""+number;
        for(int count = word.length()-1;count >= 0;count--){
            
            if(number == number){
         System.out.println(" Number is palindrome ");
 } else{
        System.out.println(" Number is not palindrome ");
    }
     


    }
 

    }
}

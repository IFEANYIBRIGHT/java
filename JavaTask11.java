import java.util.Scanner;
public  class JavaTask11 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.println(" Enter base :");
        int base = input.nextInt();
    
        System.out.println(" Enter exponent :");
        int exponent = input.nextInt();
 
        int result = 1;

        for(int count = 1;count <= exponent;count++){
        result *= base ;
           }
        System.out.println(result);

    }
}

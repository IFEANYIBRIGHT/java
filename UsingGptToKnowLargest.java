import java.util.Scanner;

public class GreatestNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // User enters 4 numbers based on counter
        for (int counter = 4; counter > 0; counter--) {

            System.out.print("Enter number " + counter + ": ");
            int number = input.nextInt();

            if (number > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;

            } else if (number > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = number;

            } else if (number > thirdLargest) {
                thirdLargest = number;
            }
        }

        System.out.println("Greatest number: " + largest);
        System.out.println("Second greatest number: " + secondLargest);
        System.out.println("Third greatest number: " + thirdLargest);

        input.close();
    }
}


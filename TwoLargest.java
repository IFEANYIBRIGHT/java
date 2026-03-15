import java.util.Scanner;
public class TwoLargest{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
                int count =1;
             int largest = firstNumber;
            int secondLargest = count;
             
          
            while(count <= 10){
        firstNumber = input.nextInt();
        if(firstNumber > largest){
        largest = firstNumber;
    }
        if(secondLargest > largest) {

       secondLargest = count ; 

}
       

        
     count++;
}
           System.out.printf( "%d is the largest %n",largest );
           
            System.out.printf( "%d is the largest %n",secondLargest );
           

        


 








}
}

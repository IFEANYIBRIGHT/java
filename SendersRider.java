import java.util.Scanner;
public class SendersRider{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String delivery =("""

    COLLECTION RATE  AMOUNT PER PERCEL    BASE PAY

    less than 50%                 160         5,000

    50 - 59%                      200         5,000

    60 - 69%                      250         5,000

    > = 70%                       500         5,000
 """);
int wages = 0;
    System.out.print("Enter number of successfull delivery made for the day: ");

if(delivery < 50){
    wages = delivery * 160 + 5000;
System.out.print("wages");

}else if(delivery >= 60 && delivery <= 69){
    wages = delivery *200 + 5000;
    System.out.print("wages");

}else if(delivery > 70 && delivery >= 70){
    wages = delivery * 250 + 5000;
    System.out.print("wages");

}else if(delivery == 0){
    System.out.print("go and rest")
                 






}





}

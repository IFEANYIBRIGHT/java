import java.util.Scanner;
import java.util.ArrayList;
public class Grocery{
    public static void main(String...args){
    Scanner input = new Scanner(System.in){

    ArrayList<String> managerApp = new ArrayList<>();
while(true){    
   System.out.println(""" 
1.Add item
2.Remove Item
3.Show All Available Item
4.Exit
""");

    System.out.println(managerApp);
    
    int select = input.nextInt();
    input.nextLine();
    switch(select){
            case 1->{
                 System.out.println("What items are u willing to add ?");
                    String items = input.nextLine(); 
                    managerApp.add(items);
                    System.out.println("Would u like to add another item ?(yes/no)");
                    String ask = input.nextLine();
                    if(ask.equalsIgnoreCase("no"))
                     System.out.println("Item added to the cart successfully");
                   continue;
            }



            case 2->{
                  System.out.println("What items are u willing to remove?");
                    String delete = input.nextLine();
                    if (delete.contains(managerApp)){
                    managerApp.remove(delete);
                    System.out.println("Item deleted Successfully");
                    }else{
                        if(managerApp.isEmpty())
               System.out.println("Nothing has been added yet!!");
           }
             }

            case 3 ->{
                   System.out.println("All items");  
                    for(String item : managerApp){
                      System.out.println(" -"+managerApp);  
                    }
                }

            case _->{
                System.out.println("Good bye ,thanks for using my app");
            break;
            }







}


}

























}















}























}

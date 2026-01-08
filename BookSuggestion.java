import java.util.ArrayList;
import java.util.Scanner;
public class BookSuggestion{
    public static void main(String... args){
ArrayList<String> books = new ArrayList<>();

    Scanner input = new Scanner(System.in);
  
    while(true){
 String suggestions = """
***WELCOME TO THE LIBRARY,PLEASE FEEL AT HOME***
1. Get Suggestions
2. Add Book
3. Remove Book
4. Update book
5. Show all books

""";
   System.out.println(suggestions);
    System.out.println(" What are your choices Today !!");
    int choice = input.nextInt();

      
    if(choice == 1){
    books.add("Book title: Tortoise and other animals :page:100");
    books.add("Book title: Sofia the princess:pages:90");
   books.add(" Book Title:The clean coder :page : 121");
     books.add("Book Title :Star wars:pages: 131 ");
    System.out.println("No More Suggestions");
    
   

      
    System.out.println("Book suggestions"); 
    for(String book: books)  {
 System.out.println(" "+ books) ;
}
     
 
}

  if (choice == 2){
      System.out.println("Add Books of ur choices !! ");
         String addBooks = input.nextLine();
         input.nextLine();
            books.add(addBooks);
        
    System.out.println(" You have successfully added a book to the library !! ");     
System.out.println();

}else if(choice == 3){
System.out.println(" Enter the book u want to remove from the library (NOTE: the book u want to remove must be in the library)!! ");
String delete = input.nextLine();
input.nextLine();
books.remove(delete);

 System.out.println(" You have successfully removed a book to the library !! ");  
System.out.println();



}else if(choice == 4){

System.out.println("Enter Old Book Name To Be  Updated :");
String update = input.nextLine();
input.nextLine();
if(books.contains(update)){

System.out.println("Enter New Book Name ");
String newBook = input.nextLine();
input.nextLine();

books.set(books.indexOf(update),newBook);
System.out.println("You Have Successfully Updated Ur Book!! ");
}
else {
System.out.println("The book U Inputed Does Not Match");
}
}
}


}


}















   









            






















































































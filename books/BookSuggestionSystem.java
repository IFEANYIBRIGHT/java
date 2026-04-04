import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookSuggestionSystem{

    static ArrayList <String> bookLibrary = new ArrayList<>();
    
    public static void main(String...args){ 
    
    Scanner input = new Scanner(System.in);
    
    boolean isRunning = true;
    
    while(isRunning){
    
    String applicationSample = """
    ==========================    
        APPLICATION SAMPLE   =
    ==========================    
    Welcome to the Book Suggestion System!

    1. Get Suggestions
    
    2. Add Book
    
    3. Remove Book
    
    4. Update book
    
    5. Show all books
        
    6. Exit    
    """;
      
     System.out.println("\n");
            
    System.out.println(applicationSample);
    
     System.out.println("Enter Operation");
    
    int operation = input.nextInt();
    input.nextLine();
    switch(operation){
    
        case 1->{
        bookSuggestions();
         
        
        }
    
        case 2->{
        
        System.out.println("Enter The book Title :");
        
        String addBooks = input.nextLine();
        
        System.out.print(addNewBooks(addBooks));
        
        
        }
    
        case 3->{
        
         System.out.println("Enter The book Title To Remove: ");
        
        String removeBooks = input.nextLine();
        
        System.out.print(removeOldBooks(removeBooks));
        
        
        }
    
    
        case 4->{
        
        System.out.println("Enter The Old Title : ");
        
        String oldTitle = input.nextLine();
        
        System.out.println("Enter The New Title : ");
        
        String newTitle = input.nextLine();
        
        System.out.print(updateBooksInLibrary(oldTitle,newTitle));
        
        
        
        }
    
   
    
    
        case 5->{
        
         System.out.println("All Books\n ");
        
        for(int count = 0;count < bookLibrary.size();count++){
        
        System.out.println(count + 1+". "+ bookLibrary.get(count)+"\n");
        
        }
        
        
        }
        
        
        case 6->{
        
        isRunning = false;
        
        System.out.println("Exiting______");
        
        
        }
    
        }
      
      }
    
   }     
    
    public static void bookSuggestions(){
    
    bookLibrary.add("The Hobbit");
    
    bookLibrary.add("Animal Farm");
    
    bookLibrary.add("The mystry");
    
    bookLibrary.add("Brave kind");
    
    bookLibrary.add("Brave kingdom");
    
    for(int count = 0;count < bookLibrary.size();count++){
    
    System.out.println();
    
    
  System.out.println("Book For The Day : \n" +"Book Title : "+bookLibrary.get(count)+"\nPage :"+getRandomPages());
    
    }
    
    }
    
    
    
    
    
    public static int getRandomPages(){
    
    Random random = new Random();
    
    int number =  random.nextInt(100);
    
    return number;



 }

     public static String addNewBooks(String book){
     
     bookLibrary.add(book);
     
     return "Book Added Successfully";
      
     }



     public static String removeOldBooks(String book) {
    
    if (bookLibrary.remove(book)) {
        return "Book Removed Successfully";
    }
    
    return "Book Not Found";
}
    


    public static String updateBooksInLibrary(String oldTitle, String newTitle) {
    
    if (bookLibrary.contains(oldTitle)) {
        
        int index = bookLibrary.indexOf(oldTitle);
        bookLibrary.set(index, newTitle);
        
        return "Book Updated Successfully";
    }
    
    return "Book Is Not In Library";
}
      
 






}

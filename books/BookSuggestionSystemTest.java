import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class BookSuggestionSystemTest{

    @Test
    
    
    public void testRandomPages(){
    
    BookSuggestionSystem randomPages = new BookSuggestionSystem();
    
    boolean  actual = (randomPages.getRandomPages()  >= 1 && randomPages.getRandomPages() <= 100);
    
    assertTrue(actual); 



    }



    @Test 
    
    public void testAddingOfNewBooks(){
    
    BookSuggestionSystem addBooks = new BookSuggestionSystem();
    
    String actual = addBooks.addNewBooks("Animal Husbandry Book ");
    
    String expected = "Book Added Successfully";
    
    assertEquals(actual,expected);
    
    
    }


    @Test 
    
    public void testRemovingOfOldBooks(){
    
    BookSuggestionSystem removeBooks = new BookSuggestionSystem();
    
    String actual = removeBooks.removeOldBooks("Animal Husbandry Book ");
    
    String expected = "Book Not Found";
    
    assertEquals(actual,expected);
    
    }



    @Test 
    
    
    public void testIfBooksUpdates(){
    
    BookSuggestionSystem updateBooks = new BookSuggestionSystem();
    
    String actual = updateBooks.updateBooksInLibrary("Animal Husbandry Book","Happy days ahead");
    
    String expected = "Book Is Not In Library";
    
    assertEquals(actual,expected);
    
    
    
    
    }


























}

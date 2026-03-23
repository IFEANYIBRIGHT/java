import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MilkyDoughnutTest{

    @Test

    public  void testCountEven(){

    int numbers [] = {2,3,4,56,7,8,24,12,5,6};

    MilkyDoughnut arrayFunctions = new MilkyDoughnut();

    int actual  = arrayFunctions.countEven(numbers);

    int expected = 7;

    assertEquals(actual,expected);

    } 



    @Test

    public void testLinearSearch(){

    int [] numbers = {1,4,5,6,7,34,56,32};

    int target = 34;

    MilkyDoughnut  search = new MilkyDoughnut();

    int actual = search.linearSearch(numbers,target);

    int expected  = 34;

    assertEquals(actual,expected);


 
    }





    @Test

    public void testSquaresOfPerfect(){

    int  numbers  = 5;

    MilkyDoughnut squares = new MilkyDoughnut();

    int actual = squares.getPerfectSquares(numbers);

    int expected = 25;

    assertEquals(actual,expected);



    }

    

    @Test

    public void testArraysEquals(){

    int []firstArray = {1,23,56,78,64,32};

    int [] secondArray = {1,23,56,78,64,32};

    
    MilkyDoughnut arraysEquals = new MilkyDoughnut();

    boolean actual  = arraysEquals.arraysEqualsLengthAndValues(firstArray,secondArray);

    assertTrue(actual);


    }



 












































}

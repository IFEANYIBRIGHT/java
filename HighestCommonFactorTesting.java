import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HighestCommonFactorTesting{


    @Test
    public void factorTesting(){
    int number[] = {4,6,8};    

    HighestCommonFactor commonFactor = new HighestCommonFactor();

    int actual = 4;
    
    boolean isExpected  = commonFactor.getCommonFactor(number);
    
    assertTrue(isExpected);
    
     

    }

    @Test
    public void hcfTesting(){

    int number[] = {6,9,15};

    HighestCommonFactor commonFactor = new HighestCommonFactor();    
        
    boolean canDivide = commonFactor.getCommonFactor(number);;
    
    
    assertTrue(canDivide);


    }





















} 

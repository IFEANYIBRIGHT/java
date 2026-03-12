import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAcConditioner{

    @Test
    public void turnOnTheAcTest(){

    int itIsOn = 0;
    AirConditional acTest = new AirConditional();

    boolean expected = acTest.TestIfItOn(itIsOn);

    boolean actual = true;

    assertEquals(expected,actual);

    }
    @Test
    public void testItIsOff(){

    int itIsOff = 1;

    AirConditional IsOff = new AirConditional();

    boolean expected = IsOff.TestItIsOff(itIsOff);
    
    boolean actual = true;

    assertEquals(expected,actual);



    }

    @Test
    public void testIfTheTemperatureIncreases(){

    int temperature = 17;

    AirConditional increaseTemp = new AirConditional();

    int expected = increaseTemp.increaseAcTemperature(temperature);

    int actual  = 17;

    assertEquals(expected,16 +1);

    }

    
    @Test
    public void testIfTheTemperatureDecreases(){

    int decreaseTemperature = 15;

    AirConditional decreasedTemp = new AirConditional();

    int expected = decreasedTemp.decreaseAcTemperature(decreaseTemperature);

    int actual = 15;

    assertEquals(expected,actual);
    
    }
    


    @Test
    public void testIfItBeyond(){
    
    int beyond = 39;

    AirConditional beyondThirty = new AirConditional();

    int expected = beyondThirty.temperatureBeyond(beyond);

    int actual = 30;

    assertEquals(expected,actual);

    }


    public void tempBelowSixteen(){

    int below = 15;

    AirConditional belowSixteen = new AirConditional();

    int expected = belowSixteen.testBelowSixteen(below);

    int actual = 16;
    
    assertEquals(expected,actual);

    





    }































}

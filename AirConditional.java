public class AirConditional{

    public boolean TestIfItOn(int itIsOn){
    
    if(itIsOn == 0){
     return true;
    }  
    return false; 
     }


    public boolean TestItIsOff(int IsOff){

    if(IsOff == 1){
        return true;
    }
    return false;



    }


    public int increaseAcTemperature(int increseTemp){
 
    int increase = 0;
    if(increseTemp > 16){
      increase =  increseTemp ;

    }

    return increase;
    }



    public int decreaseAcTemperature(int decreaseTemp){
    
    int decrease = 0;
    if (decreaseTemp < 16) {
    decrease =  decreaseTemp;

    }
    return decrease;
    }



    public int temperatureBeyond(int tempBeyond){

    if(tempBeyond > 30){
    tempBeyond = 30;
    }

    return tempBeyond;


    }


    public int testBelowSixteen(int belowSixteen){

    if(belowSixteen < 16){
    belowSixteen = 16;
    }

    return belowSixteen;



    }
















}

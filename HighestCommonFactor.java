public class HighestCommonFactor{

    public int getCommonFactor(int [] number){
    
    int factor = 0;
    for(int count = 0;count < number.length;count++){

    if(number[count] % 2 == 0){
        factor = number[count];

    }
    else if(number[count] % 1 == 0){
    factor = number[count];

    }

    }

    return factor;






    }









































}

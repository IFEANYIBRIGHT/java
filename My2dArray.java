import java.util.Date;

public class My2dArray{

    public static void main(String...args){
    Date date = new Date();


    System.out.println(date);


   int numbers [][] = {
            {2,5,6,7},{4,5,6,7},{5,7,8,0},{4,6,9}
//                0        1       2       3
             };


    int num = 0;
    for(int outerArray = 0;outerArray < numbers[2].length;outerArray++){
//            for(int innerArray = 0;innerArray < numbers[outerArray].length;innerArray++){        
                num +=  numbers[2][outerArray];


//    }


    }

    System.out.println(  num);






















}



}

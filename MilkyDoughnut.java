public class MilkyDoughnut{

    public static int countEven(int [] numbers){

    int count = 0;

    for(int index = 0; index < numbers.length;index++){

    if(numbers[index] % 2 == 0){

    count ++;

    }

    }
    return count;
 }



    public static int linearSearch(int[] numbers,int target){  
 
    for(int count = 0 ;count < numbers.length;count++){
    
        if(numbers[count] == target){
 
            return count ;
        }
    }

        return -1 ;
}


    public static boolean arraysEqualsLengthAndValues(int [] firstArray,int [] secondArray){

    for(int count = 0;count < firstArray.length;count ++){

         for(int index = 0;index < secondArray.length;index ++){
            if(firstArray[count] == secondArray[index]){
            return true ;

            }
         }
      }

     return false;

   }


<<<<<<< HEAD

    public static int[] perfectSquare(int number){

            int result [] = new int[number];

            for(int count = 0;count < number;count++){
            result [count] = count + 1  * count + 1;
 
        }
    
        return result;
=======
public static int[] getPerfectSquares(int number) {

    int[] result = new int[number];

    for (int count = 0; count < number; count++) {
        int currentNumber = count + 1;
        result[count] = currentNumber * currentNumber;
    }

    return result;

>>>>>>> 8015333 (added perfect squares solution)




    }






}

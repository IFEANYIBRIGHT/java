 public class MyArray{

    public static void main(String...args){
    
    int lowest = 0;
    int secondLowest = 0;
    int minus = 0;
    int secondLargest = 0;
    int largest = 0;
   int numbers [] = {2,5,6,7,1,6,9} ;


    int num = 0;
    for(int loop = 0;loop < numbers.length;loop++){
            for(int secondloop = 0;secondloop < numbers.length -1;secondloop++){

        if(numbers[secondloop] > largest){
            int temp = numbers[secondloop];
            numbers[secondloop] = largest;
            largest = temp;

     System.out.println( temp) ;
     
     }   
    }

        }   


    

 




}





















}

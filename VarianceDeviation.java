public class VarianceDeviation{

    public double findAverageFirst(int []number){

    int sum = 0;
    double average = 0;
   double difference = 0;
    double squaresOfVariance = 0;
    int addSquaresOfVariance = 0;
    double divideByNumber = 0;
    
            for(int count = 0;count < number.length;count++){

            sum += number[count];
            average = sum /number.length;
        
         }
                for(int count = 0;count < number.length;count++){
                difference = number[count] - average;

                    squaresOfVariance = difference * difference;

                        addSquaresOfVariance += squaresOfVariance;
   }
                            divideByNumber = addSquaresOfVariance / number.length;
 return divideByNumber;
 
    } 

    
 

    }





































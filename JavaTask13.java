public class JavaTask13{
    public static void main(String...args){
 
            String word = "Print all characters in a string individually.";
            int counter = 0;
            for(int count = 1;count < word.length();count++){
                char letter = word.charAt(count);
                if(letter == 'e'){
                    counter++;
                }
 

            }
                System.out.println(" e is just "+counter);
     }

}

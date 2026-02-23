public class JavaTask16{
    public static void main(String...args){
 
            String word = "PRINT ALL CHARACTERS IN A STRING INDIVIDUALLY.";
 
            int counter = 0;
            for(int count = 1;count < word.length();count++){
                char letters = word.charAt(count);
                   
             if(letters == 'A' ||letters == 'E'  || letters == 'I' || letters == 'O' || letters == 'U'  )
                counter++;
 

            }
 System.out.println(" vowels are "+counter+" in number");
     }

}

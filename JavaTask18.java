public class JavaTask18{
    public static void main(String...args){
 
        int number = 123456789;
 
            String word = "" + number;
            int result = 0;
     
        for(int count = 1;count <= word.length();count++){
        result += count;
 }
            System.out.println(" The sum of all the digits is  "+result);
     
}
}





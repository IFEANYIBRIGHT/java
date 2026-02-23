public class JavaTask20{
    public static void main(String...args){
 
        int number = 56087;
 
            String word = "" + number;
            int smallest = 9;
     

        for(int count = 0;count < word.length();count++){
 
            if(count < smallest)
                 smallest = count;
 }
            System.out.println(" The  smallest  is  "+smallest);
     
}
}





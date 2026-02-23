public class JavaTask19{
    public static void main(String...args){
  
        int number = 645;
 
            String word = "" + number;
            int largest = 0;
     
        for(int count = 1;count <= word.length();count++){
            if(count > largest)
                 largest = count;
 }
            System.out.println(" The  largest  is  "+largest);
     
}
}





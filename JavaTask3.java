public class JavaTask3{
    public static void main(String...args){
    

 
     String character = "UpperCase Letters Are in a String" ;
           int counter = 0; 
     for(int count = 0;count < character.length();count++){

        if(Character.isUpperCase(character.charAt(count))){
            counter++;
}
} 
       System.out.println("There are "+counter+" upper cases ");

 



    }
    

}






























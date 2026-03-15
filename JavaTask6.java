public  class JavaTask6 {
    public static void main(String[] args) {
        String character = "Print each character of a string with its ASCII value.";
    
        for(int count = 0;count < character.length();count++){
        char letter = character.charAt(count);
    
        System.out.println(letter+" = "+ (int)letter);
        }
                 




    }
}

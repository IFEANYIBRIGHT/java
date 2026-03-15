public  class JavaTask5 {
    public static void main(String[] args) {
        String word = "Bright";
        int position = -1;

        for (int count = 0; count < word.length(); count++) {
            char letter = word.charAt(count);
            if (letter == 'a'|| letter == 'e'|| letter =='i'||letter == 'o'||letter=='u'|| letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U') {
                position = count;
                break;
            }
        }

        System.out.println(position);
    }
}

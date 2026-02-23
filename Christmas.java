public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {

           
            switch (day) {
                case 1:
                    System.out.println("On the first day of Christmas");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas");
                    break;
                case 4:
                    System.out.println("On the fourth day of Christmas");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas");
                    break;
                case 8:
                    System.out.println("On the eighth day of Christmas");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas");
                    break;
            }

            System.out.println("My true love sent to me:");

            
            for (int gift = day; gift >= 1; gift--) {
                switch (gift) {
                    case 12:
                        System.out.println("Twelve drummers drumming");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping");
                        break;
                    case 10:
                        System.out.println("Ten lords a-leaping");
                        break;
                    case 9:
                        System.out.println("Nine ladies dancing");
                        break;
                    case 8:
                        System.out.println("Eight maids a-milking");
                        break;
                    case 7:
                        System.out.println("Seven swans a-swimming");
                        break;
                    case 6:
                        System.out.println("Six geese a-laying");
                        break;
                    case 5:
                        System.out.println("Five golden rings");
                        break;
                    case 4:
                        System.out.println("Four calling birds");
                        break;
                    case 3:
                        System.out.println("Three French hens");
                        break;
                    case 2:
                        System.out.println("Two turtle doves");
                        break;
                    case 1:
                        if (day == 1) {
                            System.out.println("A partridge in a pear tree");
                        } else {
                            System.out.println("And a partridge in a pear tree");
                        }
                        break;
                }
            }

            System.out.println();  
        }
    }
}


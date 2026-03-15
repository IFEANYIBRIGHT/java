import java.util.Scanner;

public class PizzaWahala2 {

    public static String ViewingPizzaTypes(String menu) {

        menu = """
        Pizza type      Number of Slices   Price per Box
           Sapa Size         4                2000
           Small Money       6                2400
           Big Boys          8                3000
           Odogwu           12                4200
        """;

        return menu;
    }

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        String menu = "";
        System.out.println(ViewingPizzaTypes(menu));

        System.out.println("What type of Pizza do you want to buy?");
        String receiveOrder = input.nextLine().toLowerCase();

        int pizzaSlice = 0;
        int prize = 0;

        switch (receiveOrder) {

            case "sapa size" -> {
                pizzaSlice = 4;
                prize = 2000;
            }

            case "small money" -> {
                pizzaSlice = 6;
                prize = 2400;
            }

            case "big boys" -> {
                pizzaSlice = 8;
                prize = 3000;
            }

            case "odogwu" -> {
                pizzaSlice = 12;
                prize = 4200;
            }

            default -> {
                System.out.println("Invalid input!!");
                return;
            }
        }

        System.out.println("How many people?");
        int numberOfPeople = input.nextInt();

        double numberOfBoxes = Math.ceil((double) numberOfPeople / pizzaSlice);

        double pizzaPrice = prize * numberOfBoxes;

        int totalSlices = (int) (numberOfBoxes * pizzaSlice);

        int leftOverPizza = totalSlices - numberOfPeople;

        System.out.printf(
                "%s pizza contains %d slices per box.\n%.0f box(es) will serve %d people.\nTotal slices: %d\nLeftover slices: %d\nTotal cost: ₦%.2f\n",
                receiveOrder, pizzaSlice, numberOfBoxes, numberOfPeople, totalSlices, leftOverPizza, pizzaPrice);
    }
}

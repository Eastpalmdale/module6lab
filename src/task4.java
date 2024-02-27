import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        String userSpasm = "";
        // outputs
        System.out.println("smash your keyboard or type in something idk.");
        if (in.hasNextInt()) {
            System.out.println("Your input, "+userSpasm+" is an int.");
        }
        else if (in.hasNextDouble()) {
            System.out.println("Your input, "+userSpasm+" is a double.");
        }
        else {
            System.out.println("Your input, "+userSpasm+" has a lot of different things in it which includes ints/doubles.");
        }
    }
}

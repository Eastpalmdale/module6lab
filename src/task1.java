import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double userNumber = 0;
        String trash;
        boolean done = false;
        //loop start
        do {
            System.out.println("Please enter your total item price.");

            if (in.hasNextInt()) {

                userNumber = in.nextInt();

                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }
        } while (!done);
        if (userNumber <= 100) {
            userNumber = userNumber * 1.02;
            System.out.println("Your price with a shipping tax of 2% is "+userNumber);
        }
        else {
            System.out.println("You have to pay 0 shipping tax, your final price is "+userNumber);
        }
    }
}
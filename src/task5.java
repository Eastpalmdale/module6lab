import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double userHeight = 0;
        double userWidth = 0;
        double userCost = 0;
        double totalCost = 0;
        String trash;
        boolean done = false;
        //loop start
        do {

            System.out.println("Please enter your height.");
            if (in.hasNextInt()) {

                userHeight = in.nextInt();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }

        } while (!done);
        done = false;
        do {

            System.out.println("Please enter your width.");
            if (in.hasNextDouble()) {

                userWidth = in.nextInt();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }

        } while (!done);
        done = false;
        do {

            System.out.println("Please enter your cost per square foot of material.");
            if (in.hasNextDouble()) {

                userCost = in.nextInt();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }

        } while (!done);
    }
}

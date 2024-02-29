import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double firstUserNumber = 0;
        double secondUserNumber = 0;
        String trash;
        boolean done = false;
        //loop start
        do {
            System.out.println("Please enter your first number.");

            if (in.hasNextInt()) {

                firstUserNumber = in.nextInt();

                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }
        } while (!done);
        done = false;
        do {
            System.out.println("Please enter your second number.");

            if (in.hasNextInt()) {

                secondUserNumber = in.nextInt();

                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }
        } while (!done);
        if (firstUserNumber == secondUserNumber) {
            System.out.println("The two numbers you inputted are equal");
        }
        else if (firstUserNumber >= secondUserNumber){
            System.out.println(firstUserNumber+" Is greater than "+secondUserNumber);
        }
        else {
            System.out.println(firstUserNumber+" Is less than "+secondUserNumber);
        }

    }
}

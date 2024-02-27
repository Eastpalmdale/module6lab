import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double userNumber = 0;
        String trash;
        boolean done = false;
        //loop start
        do {
            System.out.println("Please enter your birth month as a number that is 1 through 12.");

            if (in.hasNextInt()){
                userNumber = in.nextInt();
            }

                if (userNumber <= 12 && (userNumber >= 1)) {
                userNumber=in.nextInt();
                done=true;
                }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a number between 1 and 12");
            }

        } while (!done);
        System.out.println("Your birth month is "+userNumber);
    }
}

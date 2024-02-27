import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        String userParty = "";
        String trash;
        boolean done = false;
        //loop start
        do {
            System.out.println("Please enter your political party as an R, D, I, or O.");
            System.out.println("R is for republican, D for democrat, I for independent, O for other, this is not case dependent.");
            userParty = in.nextLine();
            userParty = userParty.toLowerCase();
        } while (!done);
        switch (userParty) {
            case "r":
                System.out.println("You are a republican elephant.");
                break;
            case "d":
                System.out.println("You are a democratic donkey.");
                break;
            case "i":
                System.out.println("You are an independent man.");
                break;
            case "o":
            System.out.println("You are Other.");
            break;
            default:
                System.out.println("Please enter r,d, i, or o, only.");
        }
    }
}
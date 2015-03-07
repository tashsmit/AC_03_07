package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/7/15.
 */
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String greeting_1 = " ";

        while (! greeting_1.equals("q")) {

            System.out.println("Please enter a greeting: ");
            greeting_1 = input.nextLine();

            if (greeting_1.toLowerCase().equals("hello")) {

                System.out.println("Hey!");

            } else if (greeting_1.toLowerCase().equals("hola")) {

                System.out.println("Como estas!");
            } else if (greeting_1.toLowerCase().equals("how are you")) {

                System.out.println("I'm great, thank you!");
            } else
                System.out.println("You are awesome");
        }

    }
}






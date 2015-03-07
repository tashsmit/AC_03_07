package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/7/15.
 */
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String greeting_1 = " ";

        System.out.println("Please enter:");
        System.out.println("Hello, Hola, How are ou or What is your name?");
        greeting_1 = input.nextLine();

        if (greeting_1.equals("Hello")) {

                System.out.println("Hey!");

            } else if (greeting_1.equals("Hola")) {

                System.out.println("Como estas!");
            } else if(greeting_1.equals("How are you")) {

                System.out.println("I'm great, thank you!");
            } else
                System.out.println("My name is Bob");
        }
        }

    }



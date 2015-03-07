package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/7/15.
 */

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String adjective1 = " ";
        String adjective2 = " ";
        String verb = " ";
        String noun = " ";
        String adverb = " ";
        String noun2 = " ";
        int someNum = 0;

        System.out.println("Please enter an adjective: ");
        adjective1 = input.next();
        System.out.println("Please enter another adjective: ");
        adjective2 = input.next();
        System.out.println("Please enter a verb: ");
        verb = input.next();
        System.out.println("Please enter a noun: ");
        noun = input.next();
        System.out.println("Please enter an adverb: ");
        adverb = input.next();
        System.out.println("Please enter another noun: ");
        noun2 = input.next();
        System.out.println("Please enter a number: ");
        someNum = input.nextInt();

        System.out.println("Here is your mad lib: ");
        System.out.println("Your " + noun + " is very " + adjective1 + " and " + adjective2 + " so please " + adverb + " " + verb +
        " to your " + noun2 + " instead and your favorite number is " + someNum + ".");





    }





}

package PriaChallenges;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Print the numbers 1 to 100,
        // if the number is divisible by 3, print fizz,
        // if the number is divisible by 5, print buzz,
        // if the number is divisible by 3 and 5, print fizzbuzz
        System.out.println("Please enter the max range for the checker: ");
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        for (int i = 1; i <= range; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else {
                System.out.println(i);
            }

        }

    }
}

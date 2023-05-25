package ReadingUserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2023;
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 100) + " and <= " + currentYear);
            int dateOfBirth = scanner.nextInt();
            age = getAge(currentYear,dateOfBirth);

            if (age != -1) {
                validDOB = true;
            }

        } while (!validDOB);

        return "So you are " + age + " years old this year";
    }

    public static int getAge(int currentYear, int dateOfBirth) {

        int minimumYear = currentYear - 100;

        if (dateOfBirth < minimumYear || dateOfBirth > currentYear) {
            return -1;
        }

        return (currentYear - dateOfBirth);

    }
}

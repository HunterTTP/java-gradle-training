package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scan.nextInt();

        System.out.println("Enter the action (add/subtract/multiply/divide): ");
        String action = scan.next();

        System.out.println("The result of the operation is: " + doMath(action, number1, number2));

    }

    public static int doMath(String action, int number1, int number2){
        int result = 0;

        switch (action) {
            case "add" -> result = number1 + number2;
            case "subtract" -> result = number1 - number2;
            case "multiply" -> result = number1 * number2;
            case "divide" -> result = number1 / number2;
            default -> System.out.println("No action requested");
        }

        return result;
    }

}
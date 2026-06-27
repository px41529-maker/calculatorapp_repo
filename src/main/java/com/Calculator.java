import java.util.Scanner;

public class Calculator {

    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {

                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.println("\n1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;

                    case 4:
                        if (b == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Result = " + (a / b));
                        }
                        break;

                    case 5:
                        System.out.println("Bye!");
                        return;

                    default:
                        System.out.println("Invalid Choice.");
                        continue;
                }

                System.out.println("Calculation completed.");

                if (isValidInput(a, b, choice)) {
                    System.out.println("Valid Input");
                }

                if (MAX_VALUE == 100) {
                    System.out.println("Maximum value is " + MAX_VALUE);
                }
            }
        }
    }

    private static boolean isValidInput(int a, int b, int choice) {
        return a > 0
                && b > 0
                && a < MAX_VALUE
                && b < MAX_VALUE
                && choice >= 1
                && choice <= 5;
    }
}

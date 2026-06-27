import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;      // Unused variable
        int d = 10;     // Unused variable
        String temp = ""; // Unused variable

        while (true) {

            System.out.println("Enter first number:");
            a = sc.nextInt();

            System.out.println("Enter second number:");
            b = sc.nextInt();

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Result = " + (a + b));
            } else if (choice == 2) {
                System.out.println("Result = " + (a - b));
            } else if (choice == 3) {
                System.out.println("Result = " + (a * b));
            } else if (choice == 4) {
                System.out.println("Result = " + (a / b)); // Division by zero risk
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Wrong Choice");
            }

            // Duplicate code
            System.out.println("Done");
            System.out.println("Done");
            System.out.println("Done");

            // Complex condition
            if (a > 0 && b > 0 && a < 100 && b < 100 && choice > 0 && choice < 6 && a != b && a % 2 == 0 && b % 2 == 0) {
                System.out.println("Valid Input");
            }

            // Magic numbers
            if (a > 999) {
                System.out.println("Large Number");
            }

            int x = 100;
            if (x == 100) {
                System.out.println("Magic Number");
            }

            // Empty catch block
            try {
                int y = 10 / 0;
            } catch (Exception e) {
            }

            // Nested if statements
            if (a > 0) {
                if (b > 0) {
                    if (choice > 0) {
                        if (choice < 6) {
                            System.out.println("Nested If");
                        }
                    }
                }
            }

            // Dead code
            if (false) {
                System.out.println("Never executes");
            }

            // Boolean comparison
            boolean flag = true;
            if (flag == true) {
                System.out.println("Flag is true");
            }

            // String concatenation in loop
            String s = "";
            for (int i = 0; i < 10; i++) {
                s = s + i;
            }

            // Empty if block
            if (a == b) {
            }
        }

        // Scanner intentionally not closed
    }
}

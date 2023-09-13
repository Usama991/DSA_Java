import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the Symbol");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                    } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) { // Check for division by zero
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue; // Continue to the next iteration of the loop
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                } else if (op == 'x' || op == 'X') {
                    break; // Exit the loop when 'x' or 'X' is entered
                    } else {
                    System.out.println("Invalid Operation");
                }
            } else {
                System.out.println("Invalid Operation");
            }

            System.out.println("Result: " + ans);
        }
    }
}
import java.util.Scanner;

public class cal {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char operation;
        double num1, num2, res = 0.00;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        System.out.print("Enter operation (+, -, /, *): ");
        operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                res = add(num1, num2);
                break;
            case '-':
                res = sub(num1, num2);
                break;
            case '/':
                res = div(num1, num2);
                break;
            case '*':
                res = mul(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result is: " + res);
    }
}

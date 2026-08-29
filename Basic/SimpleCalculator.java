import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter num2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

		switch (operator) {
         case '+':
                System.out.printf("%.1f\n", num1 + num2);
                break;

            case '-':
                System.out.printf("%.1f\n", num1 - num2);
                break;

            case '*':
                System.out.printf("%.1f\n", num1 * num2);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                } else {
                    System.out.printf("%.1f\n", num1 / num2);
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                } else {
                    System.out.printf("%.1f\n", num1 % num2);
                }
                break;

            default:
                System.out.println("invalid operator");

    	}
        scanner.close();
    }
}
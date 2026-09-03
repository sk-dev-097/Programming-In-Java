import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
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
        
        
        
    }
}
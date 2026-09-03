import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        double D =b*b-(4*a*c);

        if (D>0) {
            System.out.println("two distinct real roots");
            double root1=(-b+Math.sqrt(D))/(2*a);
            double root2=(-b-Math.sqrt(D))/(2*a);
            System.out.printf("Root 1: %.1f\n",root1);
            System.out.printf("Root 2: %.1f\n",root2);

        } else if (D == 0) {
            System.out.println("one real root");
            double root = -b / (2*a);
			System.out.printf("Root: %.1f\n", root);

        } else {
            System.out.println("no real roots");
        }

        scanner.close();
    }
}
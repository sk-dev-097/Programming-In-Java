import java.util.Scanner;

public class PlannerTimeTracker {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

		double world1Days = sc.nextDouble();
		double world2Days = sc.nextDouble();
		double earthDays = (world1Days * 2) + (world2Days * 0.5);
		System.out.printf("%.1f", earthDays);
		System.out.println();
		sc.close();
    }

}
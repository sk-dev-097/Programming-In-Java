import java.util.Scanner;
public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print("1 ");
				continue;
			}  
			int sum = 1;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		Arrays.sort(arr);

		double med;
		if(n % 2 == 0){
			med = (arr[n/2-1]+arr[n/2])/2.0;
		}
		else{
			med=arr[n/2];
		}

		System.out.printf("%.1f",med);
		System.out.println();

		sc.close();
	}
}
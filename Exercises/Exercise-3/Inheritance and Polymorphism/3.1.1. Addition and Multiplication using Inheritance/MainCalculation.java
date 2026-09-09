import java.util.Scanner;

class My_Calculation{
	int a,b;
	My_Calculation(int num1,int num2){
		a=num1;
		b=num2;
	} 
	public int addition(){
		return a+b;
	}
	public int multiplication(){
		return a*b;
	}
}

public class MainCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        My_Calculation myCalculation = new My_Calculation(num1, num2);

        int sum = myCalculation.addition();
        int product = myCalculation.multiplication();

        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
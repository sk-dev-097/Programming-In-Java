import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number for multiplication table: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter upto which multiple you want to print: ");
        int end = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + num + ":");
        System.out.println("================================");
        
        for (int i = 1; i <= end; i++) {
            int result = num * i;
            System.out.println(num + "x" + i + " = " + result);
        }
        
        scanner.close();
    }
}
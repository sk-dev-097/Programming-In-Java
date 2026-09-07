import java.util.Scanner;

public class SchoolReportGenerator {
    private static String calculateGrade(int percentage) {
	 if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
	 }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Write your code here
		 int percentage = scanner.nextInt();
         System.out.println(calculateGrade(percentage));

        scanner.close();

    }
}
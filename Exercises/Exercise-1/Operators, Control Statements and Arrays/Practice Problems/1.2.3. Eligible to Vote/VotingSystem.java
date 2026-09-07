import java.util.Scanner;
public class VotingSystem {
    // Method to check voting eligibility based on age and citizenship status
    public static void checkVotingEligibility(int age, boolean isCitizen) {
    	

		if (age >= 18 && isCitizen) {
			System.out.println("Voting Eligibility: Yes, you are eligible to vote.");

			} else if (age < 18) {
			System.out.println("Voting Eligibility: No, you are not eligible to vote. You must be 18 or older.");

			} else {
			System.out.println("Voting Eligibility: No, you are not eligible to vote. Citizenship required.");
		}

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();
        checkVotingEligibility(age, isCitizen);
    }
}

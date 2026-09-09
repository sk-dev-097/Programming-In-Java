import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SupermarketCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> checkoutLine = new LinkedList<>();
        
        while (true) {
            System.out.println("1. Add Customer to Line");
            System.out.println("2. Process Customer");
            System.out.println("3. View Checkout Line Status");
            System.out.println("4. Exit");
		int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					String customer = scanner.nextLine();
					checkoutLine.add(customer);
					System.out.println(customer + " added");
					break;
				case 2:
					if (checkoutLine.isEmpty()) {
						System.out.println("Checkout line is empty");
					} else {
						String processedCustomer = checkoutLine.poll();

						System.out.println("Processing customer: " + processedCustomer);
					}
					break;
				case 3:
					if (checkoutLine.isEmpty()) {
						System.out.println("Checkout line is empty");
					} else {
						int position = 1;

						for (String name : checkoutLine) {
							System.out.println(position + ". " + name);
							position++;
						}
					}
					break;

				case 4:
					return;
				default:
					System.out.println("Invalid choice");
			}
		}


    }
}

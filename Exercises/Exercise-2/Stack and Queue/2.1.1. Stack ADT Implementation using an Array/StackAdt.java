import java.io.*;

interface Mystack {
    void push() throws IOException;
    void pop();
    void display();
}

class Stack_array implements Mystack {
    final static int n = 5; // Stack size
    int stack[] = new int[n];
    int top = -1; // Indicates that the stack is initially empty

    // Push method to add an element to the stack
    public void push() throws IOException {
 
		if (top == n - 1) {
			System.out.println("Stack Overflow");
		} else {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Element to push:");
			int element = Integer.parseInt(br.readLine());
			stack[++top] = element;
		}
    }

    // Pop method to remove an element from the stack
    public void pop() {
        
		if (top == -1) {
			System.out.println("Stack Underflow");
		} else {
			System.out.println("Popped element: " + stack[top--]);
		}
    }

    // Display method to show all the elements in the stack
    public void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			System.out.print("Stack elements: ");
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
    }
}

public class StackAdt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Creating an instance of the stack class
        Stack_array stk = new Stack_array();
        int choice = 0;

        // Display the menu repeatedly until the user chooses to exit
        do {
            System.out.println("1. Push 2. Pop 3. Display 4. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    stk.push();
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
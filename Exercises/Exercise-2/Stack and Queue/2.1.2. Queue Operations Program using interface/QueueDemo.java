import java.util.Scanner;
interface QueueOperations {
	void enqueue(int element);
	int dequeue();
	int peek();
	boolean isEmpty();
	boolean isFull();
}

class MyQueue implements QueueOperations {

	private int[] queue;
	private int front;
	private int rear;
	private int size;

	public MyQueue(int size) {
		this.size = size;
		this.queue = new int[size];
		this.front = 0;
		this.rear = -1;
    }

    @Override
    public void enqueue(int element) {
        if (!isFull()) {

			rear++;
			queue[rear] = element;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + element);
        }
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            
			int element = queue[front];
			for (int i = 0; i < rear; i++) {
				queue[i] = queue[i + 1];
			}

			rear--;
			return element;
        } else {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;  
        }
    }

    @Override
    public int peek() {
        if (!isEmpty()) {
			return queue[front];
        } else {
            System.out.println("Queue is empty. Cannot peek");
            return -1;  
        }
    }

    @Override
    public boolean isEmpty() {
    	 return rear == -1;
    }

    @Override
    public boolean isFull() {
    	 return rear == size - 1;
    }
}
public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of the queue: ");
        int size = scanner.nextInt();
        MyQueue queue = new MyQueue(size);
        int choice;
        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Check if Queue is Full");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Element: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement != -1) {
                        System.out.println("Dequeued element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    int peekElement = queue.peek();
                    if (peekElement != -1) {
                        System.out.println("Peeked element: " + peekElement);
                    }
                    break;
                case 4:
                    System.out.println(queue.isEmpty());
                    break;
                case 5:
                    System.out.println(queue.isFull());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        } while (choice != 0);

        scanner.close();
    }
}
package practice;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}
	
	
	
	// Main method to show race condition
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue();

        // Multiple threads adding elements to the queue
        Runnable adder = () -> {
            for (int i = 0; i < 1000; i++) {
                queue.add(i);
            }
        };

        // Multiple threads removing elements from the queue
        Runnable remover = () -> {
            for (int i = 0; i < 1000; i++) {
                queue.remove();
            }
        };

        // Creating threads
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(remover);
        Thread t3 = new Thread(adder);
        Thread t4 = new Thread(remover);

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Waiting for threads to complete
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // After threads finish, there should be no issues if queue is thread-safe
        System.out.println("Finished queue operations with race condition.");
    }
}

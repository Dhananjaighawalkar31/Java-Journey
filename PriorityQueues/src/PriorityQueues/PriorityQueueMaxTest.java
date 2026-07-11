package PriorityQueues;

public class PriorityQueueMaxTest {
	public static void main(String[] args) {
        Priority_Queue_Max pq = new Priority_Queue_Max();

        // Test insert and getMax
        pq.insert(10);
        pq.insert(20);
        pq.insert(15);
        System.out.println("Max element: " + pq.getMax()); // Expected output: 20

        // Test removeMax
        System.out.println("Removed max element: " + pq.removeMax()); // Expected output: 20
        System.out.println("Max element after removal: " + pq.getMax()); // Expected output: 15

        // Test isEmpty and getSize
        System.out.println("Is empty? " + pq.isEmpty()); // Expected output: false
        System.out.println("Size: " + pq.getSize()); // Expected output: 2

        // Test removeMax until empty
        System.out.println("Removed max element: " + pq.removeMax()); // Expected output: 15
        System.out.println("Removed max element: " + pq.removeMax()); // Expected output: 10
        System.out.println("Is empty? " + pq.isEmpty()); // Expected output: true
    }

}

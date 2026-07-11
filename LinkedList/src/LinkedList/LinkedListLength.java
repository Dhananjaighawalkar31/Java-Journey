package LinkedList;

//public class LinkedListLength {
//
//}
import java.util.Scanner;



public class LinkedListLength {

    // Function to build linked list from input
    public static Node buildLinkedList(String[] input) {
        Node head = null, tail = null;
        for (String s : input) {
            int data = Integer.parseInt(s);
            if (data == -1) break;
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Iterative method to calculate length
//    public static int getLength(Node head) {
//        int count = 0;
//        while (head != null) {
//            count++;
//            head = head.next;
//        }
//        return count;
//    }
    public static int getLength(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;  // use a temporary pointer
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] elements = line.split(" ");
            Node head = buildLinkedList(elements);
            System.out.println(getLength(head));
        }
        sc.close();
    }
}
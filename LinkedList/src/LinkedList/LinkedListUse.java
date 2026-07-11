package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		//		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		//		System.out.println("n1  " + n1 + "  data  " + n1.data + "  next  " + n1.next);
		n2.next = n3;
		//		System.out.println("n2  " + n2 + "  data  " + n2.data + "  next  " + n2.next);
		//		n3.next = n4;
		//		System.out.println("n3  " + n3 + "  data  " + n3.data + "  next  " + n3.next);
		//		System.out.println("n4  " + n4 + "  data  " + n4.data + "  next  " + n4.next);
		return n1;
	}

	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;

		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				//				make this node head node and tail node
				head = currentNode; 
				tail = currentNode;
			}
			else {
				//				Node<Integer> tail = head;
				//				while(tail.next != null) {
				//					tail = tail.next;
				//				}
				////				now tail will refer to last node
				//				// connect current node after last node
				tail.next = currentNode;
				tail = currentNode;

			}

			data = s.nextInt();
		}
		return head;
	}


	public static void print(Node<Integer> head) {
		//		System.out.println("print " + head);
		Node<Integer> temp = head;
		while(temp != null ) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
//		temp = head;
		//		while(head != null ) {
		//			System.out.print(head.data + " ");
		//			head = head.next;
		//			}
		//			System.out.println();
		//		System.out.println(head.next.data);
		//		System.out.println(head.next.next.data);
		//		System.out.println(head.next.next.next.data);
	}
		public static void increment(Node<Integer> head) {
			Node<Integer> temp = head;
			while(temp != null ) {
				temp.data++;
				temp = temp.next;
			}
			System.out.println();
	
		}
		public static void printIthNode(Node<Integer> head, int i) {
			int position = 0;
			
			Node<Integer> temp = head;
			while(temp != null && position < i) {
				temp = temp.next;
				position++;
				
			}
			if(temp != null) {
				System.out.println(temp.data);
			}
	
		}
	//	public static Node buildLinkedList(String[] input) {
	//        Node head = null, tail = null;
	//        for (String s : input) {
	//            int data = Integer.parseInt(s);
	//            if (data == -1) break;
	//            Node newNode = new Node(data);
	//            if (head == null) {
	//                head = newNode;
	//                tail = newNode;
	//            } else {
	//                tail.next = newNode;
	//                tail = newNode;
	//            }
	//        }
	//        return head;
	//    }

	public static Node insert(Node<Integer> head, int elem, int pos) {
		Node<Integer> newNode  = new Node<Integer>(elem);

		if(pos == 0) {
			newNode.next = head;
//			head = newNode;
			return newNode;
		}
		else {
			int count = 0 ;
			Node<Integer> prev = head;
			while(count < pos - 1 && prev != null) {
				count++; 
				prev = prev.next;  // moves previous value to next one  if 1 is prev after while loop , 2 is prev
			}
			if(prev != null) {
				//make it before break it
				newNode.next = prev.next; //newNode to prev.next
				prev.next = newNode; //prev.next to newNode	
			}

		}
		return head;
	}
	public static void main(String[] args) {
		//		Node<Integer> n1 = new Node<>(10);
		//		System.out.println(n1);
		//		System.out.println(n1.data);
		//		System.out.println(n1.next);
		Node<Integer> head = takeInput();//   createLinkedList();
		//		increment(head);

		//		String input = s.nextLine();
//		head = insert(head, 80, 0);
//		head = deleteNode(head, 2);
		printReverse(head);
//		head = reverseLL(head);
//		int n = 2;
//		int input = findNode(head, n);
//		System.out.println(input);
//		head = removeDuplicates(head);
		//		String[] elements = input.split(" ");
		//        Node<Integer> head = buildLinkedList(elements);
//		int n = 3;
//		head = append(head, n);
//		print(head);
		//		int i = 2;
		//		printIthNode(head, i);
		//		print(head);

	}

	private static void printReverse(Node<Integer> head) {
		if(head == null) {
			return;
		}
		printReverse(head.next);
		System.out.print(head.data + " ");
		
	}

	private static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head == null) {
			return head;
		}
		Node<Integer> currHead = head;
		
		while(currHead.next != null) {
			if(currHead.data.equals(currHead.next.data)) {
				currHead.next = currHead.next.next;
			}
			else {
				currHead = currHead.next;
			}
		}
		
		
		
		return head;
		
		
	}

	private static Node<Integer> append(Node<Integer> head, int n) {
		if(n == 0 || head == null) {
			return head;
		}
		Node fast = head;
		Node slow = head;
		Node initialHead = head;
		
		for(int i = 0;i<n;i++) {
			fast = fast.next;
		}
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		Node temp = slow.next;
		slow.next = null;
		fast.next = initialHead;
		head = temp;
		return head;
	}

	private static int findNode(Node<Integer> head, int n) {
		if(head == null) {
			return -1;
			}
		
		int i = 0;
		while(head != null) {
			if(head.data.equals(n)) {
				return i;
			}
			head = head.next;
			i++;
		}
		return -1;
	}

	private static Node<Integer> deleteNode(Node<Integer> head, int pos) {

		if(head == null) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}
		int count = 0;
		Node<Integer> currentHead = head;
		while(currentHead != null && count < (pos - 1)) {
			currentHead = currentHead.next;
			count++;
		}
		if(currentHead == null || currentHead.next == null) {
			return head;
		}
		currentHead.next = currentHead.next.next;
		
		return head;
	}

	//	public static void main(String[] args) {
	//	    Scanner s = new Scanner(System.in);
	//	    System.out.println("Enter the elements of the linked list (space-separated) followed by -1:");
	//	    String input = s.nextLine();
	//	    String[] elements = input.split(" ");
	//	    Node<Integer> head = buildLinkedList(elements);
	//	    System.out.println("Linked List:");
	//	    print(head);
	//	}


}

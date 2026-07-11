package linkedLists;

import java.util.Scanner;



public class MergeSort {
	
	public static Node<Integer> createLinkedList() {

		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);

		n1.next = n2;

		n2.next = n3;

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

				tail.next = currentNode;
				tail = currentNode;

			}

			data = s.nextInt();
		}
		return head;
	}

	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);

	}
	public static Node<Integer> midpoint(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next != null && fast.next.next != null) {
		
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null ) {
			return head2;
		}
		if(head2 == null ) {
			return head1;
		}
		Node<Integer> newHead = null, newTail = null;
		
		if(head1.data < head2.data) {
			newHead = head1;
			newTail = head1 ;
			head1 = head1.next;
		}else {
			newHead = head2;
			newTail = head2;
			head2 = head2.next;
		}
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				newTail.next = head1;
				newTail = head1;
				head1 = head1.next;
			}else {
				newTail.next = head2;
				newTail = head2;
				head2 = head2.next;
			}
		}
		if(head1 != null) {
//			first list is remaining
			newTail.next = head1;
			
		}else {
			newTail.next = head2;
		}
		return newHead;
		
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> mid = midpoint(head);
		
		Node<Integer> half1 = head;
		Node<Integer> half2 = mid.next;
		mid.next = null;
		half1 = mergeSort(half1);
		half2 = mergeSort(half2);
		
		Node<Integer> finalHead = merge(half1, half2);
		
		return finalHead;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = mergeSort(head);
		printR(head);

	}

}

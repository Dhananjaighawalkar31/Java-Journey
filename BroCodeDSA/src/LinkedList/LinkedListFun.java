package LinkedList;

import java.util.Scanner;

public class LinkedListFun {

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		Node<Integer> head = createdLL();
//		incremnet(head);	
//		System.out.println(getlength(head));
//		ithElement(head, 2);

//		head = insert(head, 3, 3);
//		head = deletenode(head,2);
//		System.out.println(findNode(head, 3));
//		head = append(head, 3);
//		removeduplicates(head);
//		printR(head);
		System.out.println(palindrome(head));
		
		
		print(head);
	}

	private static void ithElement(Node<Integer> head, int i) {
		Node<Integer> temp = head;
		int position = 0;
		while(temp != null && position < i ) {
			temp = temp.next;
			position++;
		}
		if(temp != null) {
			System.out.println(temp.data);
		}
	}

	private static int getlength(Node<Integer> head) {
		int count = 0;
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
		
	}

	private static void incremnet(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
		
	}

	private static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data != -1) {
			Node<Integer> currentnode = new Node<Integer>(data);
			if(head == null) {
				head = currentnode;
				tail = currentnode;
			}
			else {
				tail.next = currentnode;
				tail = currentnode;
			}
			data = s.nextInt();
		}
		
		return head;
	}
	private static Node<Integer> createdLL() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		
		n1.next = n2;
		n2.next = n3;
		
		return n1;
	}
	public static Node<Integer> insert(Node<Integer> head, int elem, int pos){
		Node<Integer> newNode = new Node<>(elem);
		if(pos == 0) {
			newNode = head;
			return newNode;
		}
		else {
			int count = 0;
			Node<Integer> prev = head;
			while(count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if(prev != null) {
				newNode.next = prev.next;
				prev.next = newNode;
			}
		}
		return head;
	}
	public static Node<Integer> deletenode(Node<Integer> head, int pos){
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}
		int count = 0;
		Node<Integer> currentnode = head;
		while(currentnode != null && count < pos - 1) {
			currentnode = currentnode.next;
			count++;
		}
		if(currentnode == null || currentnode.next == null) {
			return head;
		}
		 currentnode.next = currentnode.next.next;
		 return head;
	}
	public static int findNode(Node<Integer> head, int n) {
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
	public static Node<Integer> append(Node<Integer> head, int n){
		if(n == 0 || head == null) {
			return head;
		}
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		Node<Integer> initialhead = head;
		for(int i = 0;i<n;i++) {
			fast = fast.next;
		}
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		Node<Integer> temp = slow.next;
		slow.next = null;
		fast.next = initialhead;
		head = temp;
		return head;
	}
	public static Node<Integer> removeduplicates(Node<Integer> head){
		if(head == null) {
			return head; 
		}
		Node<Integer> curr = head;
		while(curr.next != null) {
			if(curr.data.equals(curr.next.data)) {
				curr.next = curr.next.next;
			}
			else {
				curr = curr.next;
			}
		}
		return head;
	}
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		printR(head.next);
		System.out.print(head.data + " ");
	}
	public static Node<Integer> reverseLL(Node<Integer> head){
		Node<Integer> prev = null;
		Node<Integer> curr = head;
		
		while(curr != null) {
			Node<Integer> fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		return prev;
	} 
	public static boolean palindrome(Node<Integer> head) {
		if(head == null || head.next == null) {
			return true;
		}
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node<Integer> secHead = slow.next;
		slow.next = null;
		secHead = reverseLL(secHead);
		
		Node<Integer> first = secHead;
		Node<Integer> sec = head;
		
		while(first != null) {
			if(first.data != sec.data) {
				return false;
			}
			first = first.next;
			sec = sec.next;
		}
		first = head;
		sec = reverseLL(secHead);
		
		while(first.next != null) {
			first = first.next;
		}
		first.next = sec;
		return true;
	}
	
	
}

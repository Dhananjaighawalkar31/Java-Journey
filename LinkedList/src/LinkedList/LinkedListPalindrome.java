package LinkedList;

public class LinkedListPalindrome {
	private static  boolean palindrome(Node<Integer> head) {
		if(head == null || head.next == null) {
			return true;
		}
		Node<Integer> fast = head;
		Node<Integer> slow = head;

		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node<Integer> secHand = slow.next;
		slow.next = null;
		secHand = reverseLL(secHand);

		Node<Integer> firstSubList = secHand;
		Node<Integer> secSubList = head;

		while(firstSubList != null) {
			if(firstSubList.data != secSubList.data) {
				return false;
				
			}
			firstSubList = firstSubList.next;
			secSubList = secSubList.next;
		}
		firstSubList = head;
		secSubList = reverseLL(secHand);

		while(firstSubList.next != null) {
			firstSubList = firstSubList.next;
		}
		firstSubList.next = secSubList;

		return true;
	}
	private static Node<Integer> reverseLL(Node<Integer> head) {
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
	public static void main(String[] args) {
		 Node<Integer> head = new Node<>(1);
	        head.next = new Node<>(2);
	        head.next.next = new Node<>(3);
	        head.next.next.next = new Node<>(2);
	        head.next.next.next.next = new Node<>(1);
	        System.out.println(palindrome(head));
    }


	}

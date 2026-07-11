package linkedLists;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	DoubleNode(Node<Integer> head,Node<Integer> tail ){
		this.head = head;
		this.tail = tail;
	}
	DoubleNode(){

	}
}


public class LinkedListUse {
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
	public static void print(Node<Integer> head) {

		Node<Integer> temp = head;
		while(temp != null ) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		temp = head;

	}
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printR(head.next);

	}
	public static Node<Integer> insertR(Node<Integer> head, int elem, int pos){
		if(head == null && pos > 0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}else {
			Node<Integer> smallerHead = insertR(head.next,elem, pos -1);
			head.next = smallerHead;
			return head;
		}


	}
	public static Node<Integer> deleteR(Node<Integer> head,int pos){
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}

		Node<Integer> smallerHead = deleteR(head.next,pos - 1 );
		head.next = smallerHead;
		return head;

	}
	public static Node<Integer> reverseR(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = reverseR(head.next);
		Node<Integer> tail = smallHead;
		while( tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;



	}

	public static DoubleNode reverseRbetter(Node<Integer> head) {
		DoubleNode ans;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseRbetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	}
	public static Node<Integer> reverseRbetter1(Node<Integer> head) {
		DoubleNode ans = reverseRbetter(head);
		return ans.head;
	}
	public static Node<Integer> reverseRBest(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = reverseRBest(head.next);
		Node<Integer> reversedTail = head.next;
		reversedTail.next = head;
		head.next = null;
		return smallHead;
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

		Node<Integer> t1 = head1, t2 = head2;
		Node<Integer> head = null, tail = null;

		if(t1.data < t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;
		}else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		if(t1 != null) {
			//			first list is remaining
			tail.next = t1;

		}else {
			tail.next = t2;
		}
		return head;

	}
	public static int findNoderec(Node<Integer> head, int n) {
		if(head == null) {
			return -1;
		}

		if(head.data.equals(n)) {
			return 0;
		}
		int smallAns = findNoderec(head.next, n);

		if(smallAns == -1) {
			return -1;
		}
		return smallAns + 1;
	}
	public static Node<Integer> evenAfterOdd(Node<Integer> head){
		if(head == null) {
			return head;
		}

		Node<Integer> evenHead = null, oddHead = null, evenTail= null,oddTail = null;

		while(head!=null) {
			if(head.data % 2 == 0) {
				if(evenHead == null) {
					evenHead = head;
					evenTail = head;
				}else {
					evenTail.next = head;
					evenTail = evenTail.next;
				}
			}else {
				if(oddHead == null) {
					oddHead = head;
					oddTail = head;
				}else {
					oddTail.next = head;
					oddTail = oddTail.next;
				}
			}
			head = head.next;
		}
		if(oddHead == null) {
			return evenHead;
		}else {
			oddTail.next = evenHead;
		}
		if(evenHead != null) {
			evenTail.next = null;
		}
		return oddHead;
	}
	public static Node<Integer> skipMdeleteN(Node<Integer> head,int M, int N){
		if(M == 0 || head== null) {
			return null;
		}
		if(N == 0 ) {
			return null;
		}

		Node<Integer> currentNode = head;
		Node<Integer> temp = null;

		while(currentNode != null) {
			int take = 0;
			int skip = 0;
			while(currentNode != null && take < M) {
				if(temp == null) {
					temp = currentNode;
				}else {
					temp.next = currentNode;
					temp = currentNode;
				}
				currentNode = currentNode.next;
				take += 1;
			}
			while(currentNode != null && skip < N) {
				currentNode = currentNode.next;
				skip += 1;
			}
		}
		if(temp != null) {
			temp.next = null;
		}
		return head;



	}
	public static Node<Integer> swapNodes(Node<Integer> head,int i, int j){
		if(i == j) {
			return head;
		}
		Node<Integer> currentNode = head, prev =null;
		Node<Integer> firstNode = null, secondNode = null,firstNodePrev = null, secondNodePrev = null;

		int pos = 0;
		while(currentNode != null) {
			if(pos == i) {
				firstNodePrev = prev;
				firstNode = currentNode;
			}else if(pos == j) {
				secondNodePrev = prev;
				secondNode = currentNode;
			}
			prev = currentNode;
			currentNode = currentNode.next;
			pos += 1;

		}
		if(firstNodePrev != null) {
			firstNodePrev.next = secondNode;
		}else {
			head = secondNode;
		}
		if(secondNodePrev != null) {
			secondNodePrev.next = firstNode;
		}else {
			head = firstNode;
		}
		Node<Integer> currentfirstNode = secondNode.next;
		secondNode.next = firstNode.next;
		firstNode.next = currentfirstNode;
		return head;
	}
	public static Node<Integer> kReverse(Node<Integer> head,int k){
		if(k == 0 || k == 1) {
			return head;
		}
		Node<Integer> current = head;
		Node<Integer> fwd = null;
		Node<Integer> prev = null;

		int count = 0;

		while(count < k && current != null) {
			fwd = current.next;
			current.next = prev;
			prev = current;
			current = fwd;
			count++;
		}

		if(fwd != null) {
			head.next = kReverse(fwd, k);

		}
		return prev;
	}
	private static int length(Node<Integer> head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	public static Node<Integer> bubbleSort(Node<Integer> head){
		int n = length(head);
		for(int i = 0; i < n - 1; i++) {
			Node<Integer> prev = null;
			Node<Integer> curr = head; 

			for(int j = 0; j< (n - i - 1); j++) {
				if(curr.data <= curr.next.data) {
					prev = curr;
					curr = curr.next;
				}
				else {
					if(prev == null) {
						Node<Integer> fwd = curr.next;
						head = head.next;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}else {
						Node<Integer> fwd = curr.next;
						prev.next = fwd;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}
				}
			}	

		}
		return head;
	}



	public static void main(String[] args) {


		Node<Integer> head = takeInput();
		//		print(head);
		//		head = insertR(head, 20 , 2);
		//		head = deleteR(head, 2);
		//		head = reverseR(head);
		//		head = reverseRbetter1(head);
		//		printR(ans.head);
		//		head = reverseRBest(head);
		//		Node<Integer> mid = midpoint(head);
		//		System.out.println(mid.data);
		//		Node<Integer> head1 = takeInput();
		//		Node<Integer> head2 = takeInput();
		//		Node<Integer> head = merge(head1, head2);
		//		int n = 2;
		//		int m = findNoderec(head,n);
		//		System.out.println("Index of " + n + ": " + m);
		//		head = evenAfterOdd(head);
		//		head = skipMdeleteN(head, 2, 3);
		//		head = swapNodes(head, 2, 3);
		//		head = kReverse(head, 3);
		head = bubbleSort(head);
		printR(head);

	}
}
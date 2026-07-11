package LinkedList;

import java.util.Scanner;



public class LinkedListRecursive {

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		head = insertR(head,2, 2);
//		head = deleteR(head, 1);
//		head = reverseR(head);
//		Node<Integer> mid = midpoint(head);
//		System.out.println(mid.data);
//		int find = findNodeRec(head, 2);
//		System.out.println(find);
//		evenafterodd(head);
//		head = evenafterodd(head);
//		head = skipMdeleteN(head, 3 , 3);
//		head = swapNodes(head , 2, 3);
//		head = kReverse(head , 3);
		head = bubblesort(head);
		printR(head);
	}
	private static LinkedList.Node<Integer> bubblesort(LinkedList.Node<Integer> head) {
		int n = length(head);
		for(int i = 0;i< n - 1; i++){
			Node<Integer> prev = null;
			Node<Integer> curr = head;
			for(int j = 0; j < n - i - 1 ; j++) {
				if(curr.data < curr.next.data) {
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
					}
					else {
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
	private static Node<Integer> kReverse(Node<Integer> head, int k) {
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
		if(fwd != null){
			head.next = kReverse(fwd , k);
		}
		return prev;
	}
	private static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		if(i == j) {
			return head;
		}
		Node<Integer> currentnode = head, prev = null;
		Node<Integer> firstnode = null,secnode = null,firstnodeprev = null,secnodeprev = null;
		int pos = 0;
		while(currentnode != null) {
			if(pos == i) {
				firstnodeprev = prev;
				firstnode = currentnode;
			}else if(pos == j) {
				secnodeprev = prev;
				secnode = currentnode;
			}
			prev = currentnode;
			currentnode = currentnode.next;
			pos += 1;
		}
		if(firstnodeprev != null) {
			firstnodeprev.next = secnode;
		}else {
			head = secnode;
		}
		if(secnodeprev != null) {
			secnodeprev.next = firstnode;
		}else {
			head = firstnode;
		}
		Node<Integer> currentfirstnode = secnode.next;
		secnode.next = firstnode.next;
		firstnode.next = currentfirstnode;
		
		return head;
		
	}
	private static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		if(M == 0 || head == null) {
			return null;
		}
		if(N == 0) {
			return null;
		}
		
		Node<Integer> currentnode = head;
		Node<Integer> temp = null;
		
		while(currentnode != null) {
			int take = 0;
			int skip = 0;
			while(currentnode != null && take < M) {
				if(temp == null) {
					temp = currentnode;
				}
				else {
					temp.next = currentnode;
					temp = currentnode;
				}
				currentnode = currentnode.next;
				take += 1;
			}
			while(currentnode != null && skip < N) {
				currentnode = currentnode.next;
				skip += 1;
			}
		}
		if(temp != null) {
			temp.next = null;
		}
		return head;
	}
	private static Node<Integer> evenafterodd(Node<Integer> head) {
		if(head == null) {
			return head;
		}
		Node<Integer> evenhead = null,oddhead = null,eventail = null,oddtail = null;
		while(head != null) {
			if(head.data % 2 == 0) {
				if(evenhead == null) {
					evenhead = head;
					eventail = head;
				}else {
					eventail.next = head;
					eventail = eventail.next;
				}
			}else {
				if(oddhead == null) {
					oddhead = head;
					oddtail = head;
				}else {
					oddtail.next = head;
					oddtail = oddtail.next;
				}
			}
			head = head.next;
		}
		if(oddhead == null) {
			return evenhead;
		}else {
			oddtail.next = evenhead;
		}
		if(evenhead == null) {
			return oddhead;
		}else {
			eventail.next = null;
		}
		return oddhead;
		
		
	}
	private static int findNodeRec(Node<Integer> head, int n) {
		if(head == null) {
			return -1;
		}
		if(head.data.equals(n)) {
			return 0;
		}
		int smallAns = findNodeRec(head.next,n);
		if(smallAns == -1) {
			return -1;
		}
		return smallAns + 1;
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
		Node<Integer> finalhead = merge(half1,half2);
		return finalhead;
		}
	private static int length(Node<Integer> head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	private static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		Node<Integer> newHead = null,newTail = null;
		
		if(head1.data < head2.data) {
			newHead = head1;
			newTail = head1;
			head1 = head1.next;
		}
		else {
			newHead = head2;
			newTail = head2;
			head2 = head2.next;
		}
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				newTail.next = head1;
				newTail = head1;
				head1 = head1.next;
			}
			else {
				newTail.next = head2;
				newTail = head2;
				head2 = head2.next;
			}
		}
		if(head1 != null) {
			newTail.next = head1;
		}
		else {
			newTail.next = head2;
		}
		return newHead;
	}
	private static Node<Integer> midpoint(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private static Node<Integer> reverseR(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallhead = reverseR(head.next);
		Node<Integer> reversedtail = head.next;
		reversedtail.next = head;
		head.next = null;
		return smallhead;
	}

	private static Node<Integer> deleteR(Node<Integer> head, int pos) {
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}
		Node<Integer> smallhead = deleteR(head.next,pos - 1);
		head.next = smallhead;
		return head;

	}

	private static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> currentnode = new Node<>(elem);
			currentnode.next = head;
			return currentnode;
		}
		else {
			Node<Integer> smallNode = insertR(head.next, elem, pos -1);
			head.next = smallNode;

		}

		return head;
	}

	private static void printR(Node<Integer> head) {
		if(head == null) {
			return ;
		}
		System.out.print(head.data + " ");
		printR(head.next);

	}

	private static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentnode = new Node<Integer>(data); 
			if(head == null) {
				head = currentnode;
				tail = currentnode;
			}else {
				tail.next = currentnode;
				tail = currentnode;
			}
			data = s.nextInt();
		}

		return head;

	}

}

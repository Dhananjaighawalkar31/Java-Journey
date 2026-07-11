package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
	public static void postOrder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		for(int i = 0;i < root.children.size();i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data);
	}
	public static void preOrder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data);
		for(int i = 0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}
//	9
	public static int numleafNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.children.size() == 0) {
			return 1;
		}
		int count = 0;
		for(int i = 0;i<root.children.size();i++) {
			count += numleafNodes(root.children.get(i));
		}
		return count;
		
	}
	
//8	
	public static void printAtk(TreeNode<Integer> root,int k) {
		if(k < 0) {
			return ;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0;i<root.children.size();i++) {
			printAtk(root.children.get(i), k-1);
		}
		
	}
//	7
	public static int height(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int maxHeight = 0;
		
		for(int i = 0;i<root.children.size();i++) {
			int childHeight = height(root.children.get(i));
			if(childHeight > maxHeight) {
				maxHeight = childHeight;
			}
		}
		return maxHeight + 1;
	}
//	6
	public static int Largest(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int ans  = root.data;
		
		for(int i = 0;i<root.children.size();i++) {
			int childLargest = Largest(root.children.get(i));
			if(childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
	}
//	5
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null){
			return 0;
		}
		int count = 1;
		for(int i = 0; i< root.children.size();i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
	}
//	3
	public static TreeNode<Integer> takeInput(Scanner s){
		int n;
		System.out.println("enter next node");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("number of children of" + n);
		int childCount = s.nextInt(); 
		for(int i = 0;i<childCount;i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
		
	}
//	3
	public static void print(TreeNode<Integer> root) {
		String s = root.data + " : ";
	    for (int i = 0; i < root.children.size(); i++) {
	        s = s + root.children.get(i).data + " ";
	    }
	    System.out.println(s);
	    for (int i = 0; i < root.children.size(); i++) {
	        print(root.children.get(i));
	    }

	}
//	4
	public static void printLevelWise(TreeNode<Integer> root) {
	    Queue<TreeNode<Integer>> queue = new LinkedList<>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	        TreeNode<Integer> node = queue.poll();
	        System.out.print(node.data + " : ");
	        for (int i = 0; i < node.children.size(); i++) {
	            System.out.print(node.children.get(i).data + " ");
	            queue.add(node.children.get(i));
	        }
	        System.out.println();
	    }
	}
//4
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter root data : ");
		int rootdata = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootdata);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontnode = pendingNodes.dequeue();
				System.out.println("enter number of children of" + frontnode.data);
				int numChildren = s.nextInt();
				for(int i = 0;i<numChildren;i++) {
					System.out.println("Enter " + (i + 1) +"th child of " + frontnode.data);
					int child = s.nextInt();
					TreeNode<Integer> childnode = new TreeNode<Integer>(child);
					frontnode.children.add(childnode);
					pendingNodes.enqueue(childnode);
					
					
				}
			} catch (QueueFullException e) {
				return null;
			}
		}
		return root;
		
		
	}
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
//		printLevelWise(root);
//		System.out.println(Largest(root));
//		System.out.println(numNodes(root));
//		System.out.println(height(root));
//		printAtk(root, 2);
//		System.out.println(numleafNodes(root));
//		preOrder(root);
//		System.out.println();
		postOrder(root);
		System.out.println();
		
		
//		TreeNode<Integer> root = new TreeNode<Integer>(4);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		
//		System.out.println(root);
		
		
		
		
		
	}
}

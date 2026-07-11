package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class TreeUse {

	public static TreeNode<Integer> takeInput(Scanner s){
		System.out.println("enter next node");
		int n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		System.out.println("num of children of " + n);
		int childcount = s.nextInt();
		for(int i = 0;i < childcount;i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	public static void print(TreeNode<Integer> root) {
		String s = root.data + " ";
		for(int i = 0;i<root.children.size();i++) {
			s = s + root.children.get(i).data + " ";
		}
		System.out.println(s);
		for(int i = 0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter root data :");
		int rootdata = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootdata);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("enter the number of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for(int i = 0;i<numChildren;i++) {
					System.out.println("enter " + (i + 1) + "th child of" + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			}catch(QueueFullException e) {
				return null;
			}
		}

		return root;
	}
	public static void printlevelwise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> node = queue.poll();
			System.out.print(node.data + ":");
			for(int i = 0;i<node.children.size();i++) {
				System.out.print(node.children.get(i).data + " ");
				queue.add(node.children.get(i));
			}
			System.out.println();
		}
	}
	
	public static int numNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int count = 1;
		for(int i = 0;i<root.children.size();i++) {
			count += numNodes(root.children.get(i)); 
		}
		return count;
	}
	
	public static int largest(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int ans = root.data;
		for(int i = 0;i<root.children.size();i++) {
			int childlargest = largest(root.children.get(i));
			if(childlargest > ans) {
				ans = childlargest;
			}
		}
		return ans;
	}
	public static int height(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int maxheight = 0;
		for(int i = 0;i<root.children.size();i++) {
			int childheight = height(root.children.get(i));
			if(childheight > maxheight) {
				maxheight = childheight;
			}
		}
		return maxheight + 1;
		
	}
	public static void printAtk(TreeNode<Integer> root,int k) {
		if(k<0) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0;i<root.children.size();i++) {
			printAtk(root.children.get(i),k-1);
		}
	}
	public static int numOfleaf(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.children.size() == 0) {
			return 1;
		}
		int count = 0;
		for(int i = 0; i< root.children.size();i++) {
			count += numOfleaf(root.children.get(i));
		}
		return count;
	}
	public static void preOrder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		for(int i = 0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}
	public static void postOrder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		for(int i = 0;i < root.children.size();i++) {
			postOrder(root.children.get(i));
		}
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		//		TreeNode<Integer> root = new TreeNode<>(4);
		//		TreeNode<Integer> n1 = new TreeNode<>(6);
		//		
		//		root.children.add(n1);
		Scanner s = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(s);
//		print(root);
		TreeNode<Integer> root = takeInputLevelWise();
		printlevelwise(root);
//		System.out.println(largest(root));
//		System.out.println(numNodes(root));
//		System.out.println(height(root));
//		printAtk(root, 2);
//		System.out.println(numOfleaf(root));
//		preOrder(root);
		postOrder(root);
	}

}

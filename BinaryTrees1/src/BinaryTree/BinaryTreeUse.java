package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("enter root data");
		}else {
			if(isLeft) {
				System.out.println("enter left child:" + parentData);
			}else {
				System.out.println("enter right child of " + parentData );
			}

		}

		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData,true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false,rootData,false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int getSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		int leftSum = getSum(root.left);
		int rightSum = getSum(root.right);
		return leftSum + rightSum + root.data;
	}

	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		//		base case
		if(root == null) {
			return;
		}
		System.out.print(root.data + " : ");
		if(root.left != null) {
			System.out.print("L" + root.left.data + " , ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	//	preOrder
	public static void printTree(BinaryTreeNode<Integer> root) {
		//		base case
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
		//		if(root.left != null) {
		//			printTree(root.left);
		//		}
		//		if(root.right != null) {
		//			printTree(root.right);
		//		}
	}
	//	postOrder
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);

		System.out.println(root.data);
	}
	//24
	private static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root,int level) {
		if(root == null) {
			return;
		}
		root.data = level;

		changeToDepthTreeHelper(root.left,level+1);
		changeToDepthTreeHelper(root.right,level+1);
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeToDepthTreeHelper(root,0);
	}
	//	25
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x) {
		if(root == null) {
			return false;
		}
		if(root.data.equals(x)) {
			return true;
		}
		return (isNodePresent(root.left,x) || (isNodePresent(root.right,x)));
	}
	public static Pair diameterhelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			Pair pair = new Pair(0, 0);
			return pair;
		}
		Pair leftPair = diameterhelper(root.left);
		Pair rightPair = diameterhelper(root.right);

		int leftDiameter = leftPair.diameter;
		int rightDiameter = rightPair.diameter;

		int dist = leftPair.height + rightPair.height + 1;

		int diameter = Math.max(leftDiameter, Math.max(rightDiameter, dist));
		int height = Math.max(leftPair.height, rightPair.height) + 1;
		return (new Pair(diameter, height));
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		Pair pair = diameterhelper(root);
		return pair.diameter;
	}
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();

		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);

		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.println("enter left child of" + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}

			System.out.println("enter right child of" + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;

	}

	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int pre[],int in[],int siPre,int eiPre,int siIn,int eiIn){
		if(siPre>eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);


		int rootindex = -1;
		for(int i = siIn; i <= eiIn;i++) {
			if(in[i] == rootData) {
				rootindex = i;
				break;
			}
		}



		int siPreLeft = siPre +1;
		int siInLeft = siIn;	
		int eiInLeft = rootindex - 1;
		int siInRight = rootindex + 1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;

		int leftSubtreeLength = eiInLeft - siInLeft + 1;

		int eiPreLeft = siPreLeft + leftSubtreeLength - 1;
		int siPreRight = eiPreLeft + 1;

		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft,eiInLeft);
		BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
		root.left = left;
		root.right = right;



		return root;

	}
	public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[],int in[]){
		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length - 1, 0,in.length - 1);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int postStart,int postEnd, int[] inOrder,int inStart,int inEnd){
		if(postStart > postEnd || inStart > inEnd) {
			return null;
		}

		int rootVal = postOrder[postEnd];
		BinaryTreeNode<Integer> root =  new BinaryTreeNode<>(rootVal);
		int k = 0;
		for(int i = inStart; i<= inEnd;i++) {
			if(rootVal == inOrder[i]) {
				k = i;
				break;
			}
		}

		root.left = buildTreeHelper(postOrder,postStart,postStart + k - inStart - 1,inOrder,inStart,k-1);
		root.right = buildTreeHelper(postOrder,postStart + k - inStart,postEnd - 1,inOrder,k+1,inEnd);

		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder,int[] inOrder){
		int n = postOrder.length;

		int postStart = 0;
		int postEnd = n - 1;
		int inStart= 0;
		int inEnd = n - 1;

		return buildTreeHelper(postOrder, postStart,postEnd,inOrder,inStart,inEnd);
	}
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
		BinaryTreeNode<Integer> rootLeft = root.left;

		root.left = newNode;
		newNode.left = rootLeft;

		insertDuplicateNode(rootLeft);
		insertDuplicateNode(root.right);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root,int k, String path,int currSum) {
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			currSum += root.data;

			if(currSum == k) {
				System.out.println(path + root.data + " ");
			}
			return;
		}
		rootToLeafPathsSumToK(root.left,k,(path + root.data + " "),(currSum + root.data));
		rootToLeafPathsSumToK(root.right,k,(path + root.data + " "),(currSum + root.data));

	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		rootToLeafPathsSumToK(root,k,"",0);
	}
	public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root,int target,int k) {
		if(root == null) {
			return -1;
		}
		if(root.data == target) {
			nodesAtDistanceKDown(root, k);
			return 0;
		}

		int leftD = nodesAtDistanceKHelper(root.left, target, k);
		if(leftD != -1) {
			if(leftD + 1 == k) {
				System.err.println(root.data);
			}else {
				nodesAtDistanceKDown(root.right, k - leftD - 2);
			}
			return 1 + leftD;
		}

		int rightD = nodesAtDistanceKHelper(root.right, target, k);
		if(rightD != -1) {
			if(rightD + 1 == k) {
				System.out.println(root.data);
			}else {
				nodesAtDistanceKDown(root.left, k - rightD - 2);
			}
			return 1 + rightD;
		}
		return -1;
	}
	public static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root,int k) {
		if(root == null) {
			return ;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}

		nodesAtDistanceKDown(root.left,k - 1);
		nodesAtDistanceKDown(root.right, k - 1);
	}

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root,int node, int k) {
		nodesAtDistanceKHelper(root, node,k);
	}
	public static void printLevelWiseBetter(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		pendingNodes.add(null);

		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			if(frontNode == null) {
				System.out.println();
				if(!pendingNodes.isEmpty()) {
					pendingNodes.add(null);
				}
			}else {
				System.out.print(frontNode.data + " ");

				if(frontNode.left != null) {
					pendingNodes.add(frontNode.left);
				}
				if(frontNode.right != null) {
					pendingNodes.add(frontNode.right);
				}
			}

		}
	}




	//	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root){
	//		if(root == null) {
	//			return new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
	//		}
	//		Pair<Integer,Integer> leftPair = getMinAndMax(root.left);
	//		Pair<Integer,Integer> rightPair = getMinAndMax(root.right);
	//
	//		int minimum = Math.min(root.data,Math.min(leftPair.minimum, rightPair.minimum));
	//		int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));
	//
	//		return new Pair<>(minimum, maximum);
	//	}

	//26
	public static void printNodeWithoutSiblings(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		if(root.left == null && root.right != null) {
			System.out.println(root.right.data + " ");
		}else if(root.left != null && root.right == null) {
			System.out.println(root.left.data + " ");
		}

		printNodeWithoutSiblings(root.left);
		printNodeWithoutSiblings(root.right);

	}
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;


	}
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}

		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);

		BinaryTreeNode<Integer> tempLeft = root.left;
		root.left = root.right;
		root.right = tempLeft;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if(Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);

		return isLeftBalanced && isRightBalanced;
	}
	public static balancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			balancedTreeReturn ans = new balancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		balancedTreeReturn leftOutput = isBalancedBetter(root.left);
		balancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height ,rightOutput.height );

		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}

		balancedTreeReturn ans = new balancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;


	}
	//	17
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));

	}
	//	19
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	//	23
	public static void printAtdepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return ;
		}
		printAtdepthK(root.left,k - 1);
		printAtdepthK(root.right,k - 1);
	}
	//	18
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root,int x) {
		if(root == null) {
			return 0;
		}

		int count = (root.data > x) ? 1: 0;

		if(root.left != null) {
			count += countNodesGreaterThanX(root.left, x);
		}
		if(root.right != null) {
			count += countNodesGreaterThanX(root.right, x);
		}

		return count;
	}

	//  22
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0 ;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return numLeaves(root.left) + numLeaves(root.right);
	}
	//BST
	public static boolean searchInBST(BinaryTreeNode<Integer> root,int k ) {
		if(root == null) {
			return false;
		}
		if(root.data == k) {
			return true;
		}
		else if(root.data > k) {
			return searchInBST(root.left,k);
		}
		else {
			return searchInBST(root.right,k);
		}
	}

	public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root == null) {
			return;
		}
		if(root.data < k1) {
			printBetweenK1K2(root.right,k1,k2);
		}else if(root.data > k2) {
			printBetweenK1K2(root.left,k1,k2);
		}else {
			System.out.println(root.data);
			printBetweenK1K2(root.left,k1,k2);
			printBetweenK1K2(root.right,k1,k2);
		}
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int n){
		return SortedArrayToBSTHelper(arr,0,n - 1);
	}

	private static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = start + (end - start)/2;

		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[mid]);
		temp.left = SortedArrayToBSTHelper(arr,start,mid - 1);
		temp.right = SortedArrayToBSTHelper(arr,mid + 1,end);
		return temp;
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		return Math.min(root.data,Math.min(leftMin, rightMin));


	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftMax = largest(root.left);
		if(leftMax >= root.data) {
			return false;
		}
		int rightMin = minimum(root.right);
		if(rightMin < root.data) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
	}
	public static isBSTreturn isBST2(BinaryTreeNode<Integer> root) {
		if(root == null) {
			isBSTreturn ans = new isBSTreturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
			return ans;
		}
		isBSTreturn leftAns = isBST2(root.left);
		isBSTreturn rightAns = isBST2(root.right);

		int min = Math.min(root.data, Math.min(leftAns.min,rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max,rightAns.max));
		boolean isBST = true;
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		if(rightAns.min < root.data) {
			isBST = false;
		}
		if(!leftAns.isBST) {
			isBST = false;
		}
		if(!rightAns.isBST) {
			isBST = false;
		}
		isBSTreturn ans = new isBSTreturn(min,max,isBST); 
		return ans;

	}
	public static boolean isBST3(BinaryTreeNode<Integer> root,int minRange,int maxRange) {
		if(root == null) {
			return true;
		}
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}

		boolean isLeftWithinRange = isBST3(root.left,minRange,root.data - 1);
		boolean isRightWithinRange = isBST3(root.right,root.data,maxRange);
		return isLeftWithinRange && isRightWithinRange;

	}
	public static LinkedListNode<Integer> constructLL(BinaryTreeNode<Integer> root){
		return constructLLHelper(root).head;
	}

	private static PairOfNodeElem constructLLHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			PairOfNodeElem pair = new PairOfNodeElem();
			return pair;
		}
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(root.data);
		PairOfNodeElem leftList = constructLLHelper(root.left);
		PairOfNodeElem rightList = constructLLHelper(root.right);
		PairOfNodeElem pair = new PairOfNodeElem();
		if(leftList.tail != null) {
			leftList.tail.next = newNode;
		}
		newNode.next = rightList.head;

		if(leftList.head != null) {
			pair.head = leftList.head;
		}else {
			pair.head = newNode;
		}
		if(rightList.tail != null) {
			pair.tail = rightList.tail;
		}else {
			pair.tail = newNode;
		}
		return pair;
	}

	public static BinaryTreeNode<Integer> getLCAUutil(BinaryTreeNode<Integer> root,int a,int b){
		if(root == null || root.data == a || root.data == b) {
			return root;
		}
		if(root.data<a && root.data < b) {
			return getLCAUutil(root.right,a,b);
		}
		else if(root.data> a && root.data>b) {
			return getLCAUutil(root.left,a,b);
		}
		BinaryTreeNode<Integer> leftLCA = getLCAUutil(root.left,a,b);
		BinaryTreeNode<Integer> rightLCA = getLCAUutil(root.right,a,b);
		if(leftLCA != null && rightLCA != null) {
			return root;
		}
		else if(leftLCA != null) {
			return leftLCA;
		}
		return rightLCA;

	}

	public static int getLCA(BinaryTreeNode<Integer> root, int a,int b) {
		BinaryTreeNode<Integer> node = getLCAUutil(root,a,b);
		return (node == null) ? -1 : node.data;
	}

	public static int replaceWithLargestNodeSum(BinaryTreeNode<Integer> root,int sum) {
		if(root == null) {
			return sum;
		}
		sum = replaceWithLargestNodeSum(root.right,sum);
		sum += root.data;
		root.data = sum;
		sum = replaceWithLargestNodeSum(root.left,sum);
		return sum;
	}

	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
		if(root == null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftOutput = nodeToRootPath(root.left,x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;
	}

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root,int k){
		if(root == null) {
			return null;
		}
		if(root.data == k) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		else if(k < root.data) {
			ArrayList<Integer> leftOutput = getPath(root.left, k);
			if(leftOutput != null) {
				leftOutput.add(root.data);
			}
			return leftOutput;
		}
		else {
			ArrayList<Integer> rightOutput = getPath(root.right, k);
			if(rightOutput != null) {
				rightOutput.add(root.data);
			}
			return rightOutput;
		}
	}

	public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node , int x){
		if(node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}  

		if(x >= node.data) {
			node.right = insert(node.right, x);
		}else {
			node.left = insert(node.left, x);
		}
		return node;
	}

	public static ArrayList<LinkedListNode<Integer>> constructLLForEachLevel(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}

		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
		pendingNodes.add(root);

		int currentLevelRemaining = 1;
		int nextLevelCount = 0;

		LinkedListNode<Integer> currentLevelHead = null;
		LinkedListNode<Integer> currentLevelTail = null;
		ArrayList<LinkedListNode<Integer>> output = new ArrayList<>();

		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode;
			currentNode = pendingNodes.remove();
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(currentNode.data);
			if(currentLevelHead == null) {
				currentLevelHead = newNode;
				currentLevelTail = newNode;
			}
			else {
				currentLevelTail.next = newNode;
				currentLevelTail = newNode;
			}
			if(currentNode.left != null) {
				pendingNodes.add(currentNode.left);
				nextLevelCount++;
			}
			if(currentNode.right != null) {
				pendingNodes.add(currentNode.right);
				nextLevelCount++;
			}
			currentLevelRemaining--;
			if(currentLevelRemaining == 0) {
				output.add(currentLevelHead);
				currentLevelHead = null;
				currentLevelTail = null;
				currentLevelRemaining = nextLevelCount;
				nextLevelCount = 0;
			}

		}
		return output;
	}

	public static bstSubtreeReturn largestBSTSubTreeHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			bstSubtreeReturn ans = new bstSubtreeReturn();
			ans.max = Integer.MIN_VALUE;
			ans.min = Integer.MAX_VALUE;
			ans.isBST = true;
			ans.height = 0;
			return ans;
		}
		bstSubtreeReturn left = largestBSTSubTreeHelper(root.left);
		bstSubtreeReturn right = largestBSTSubTreeHelper(root.right);
		if(!(right.isBST && right.min > root.data)) {
			right.isBST = false;
		}
		if(!(left.isBST && left.max < root.data)) {
			left.isBST = false;
		}
		bstSubtreeReturn ans = new bstSubtreeReturn();
		if(!left.isBST || !right.isBST || root.data < left.max || root.data > right.min) {
			if(left.height > right.height) {
				left.isBST = false;
				return left;
			}else {
				right.isBST = false;
				return right;
			}
		}
		ans.isBST = true;
		ans.min = Math.min(left.min, Math.min(right.min, root.data));
		ans.max = Math.max(left.max, Math.max(right.max, root.data));
		ans.height = Math.max(left.height, right.height) + 1;
		return ans; 


	}
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		return largestBSTSubTreeHelper(root).height; 
	}

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		return countNodes(root.left) + countNodes(root.right) + 1;
	}

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		if(root == null) {
			return;
		}
		int totalCount = countNodes(root);
		int count = 0;
		Stack<BinaryTreeNode<Integer>> inorder = new Stack<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> revInorder = new Stack<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> temp = root;
		while(temp != null) {
			inorder.push(temp);
			temp = temp.left;
		}
		temp = root;
		while(temp != null) {
			revInorder.push(temp);
			temp = temp.right;
		}

		while(count < totalCount - 1) {
			BinaryTreeNode<Integer> top1 = inorder.peek();
			BinaryTreeNode<Integer> top2 = revInorder.peek();
			if(top1.data + top2.data == s) {
				System.out.println(top1.data +  " " + top2.data);

				BinaryTreeNode<Integer> top = top1;
				inorder.pop();
				count++;
				if(top.right != null) {
					top = top.right;
					while(top != null) {
						inorder.push(top);
						top = top.left;
					}
				}

				top = top2;
				revInorder.pop();
				count++;
				if(top.left != null) {
					top = top.left;
					while(top != null) {
						revInorder.push(top);
						top = top.right;
					}
				}
			}else if(top1.data + top2.data > s) {
				BinaryTreeNode<Integer> top = top2;
				revInorder.pop();
				count++;
				if(top.left != null) {
					top = top.left;
					while(top != null) {
						revInorder.push(top);
						top = top.right;
					}
				}

			}else {
				BinaryTreeNode<Integer> top = top1;
				inorder.pop();
				count++;
				if(top.right != null) {
					top = top.right;
					while(top != null) {
						inorder.push(top);
						top = top.left;
					}
				}
			}
		}



	}











	public static void main(String[] args) {

		//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
		//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
		//		root.left = rootLeft;
		//		root.right = rootRight;
		//		
		//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
		//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
		//		
		//		rootLeft.right = twoRight;
		//		rootRight.left = threeLeft;
		//		printTreeDetailed(root);
		//				BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0 ,true);
		//		postOrder(root);

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		//		printTreeDetailed(root);

		//		System.out.println("number of nodes are :" + numNodes(root));
		//		System.out.println("Largest" + largest(root));
		//		printAtdepthK(root,2);
		//		System.out.println(isNodePresent(root,2));
		//		printNodeWithoutSiblings(root);
		//		BinaryTreeNode<Integer> newRoot = removeLeaves(root);
		//		printTreeDetailed(newRoot);
		//		mirrorBinaryTree(root);
		//		printTreeDetailed(root);
		//		System.out.println("is balanced " + isBalancedBetter(root).isBalanced);
		//		int diameter = diameterOfBinaryTree(root);
		//		System.out.println("Diameter: " + diameter);

		//				int in[] = {1,2,3,4,5,6,7};
		//				int pre[] = {4,2,1,3,6,5,7};
		//		//				BinaryTreeNode<Integer> root = buildTreeFromPreIn(pre, in);
		//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		//		int n = arr.length;
		//		BinaryTreeNode<Integer> root = SortedArrayToBST(arr, n);

		printTreeDetailed(root);
		//		System.out.println(isBST(root));
		//		isBSTreturn ans = isBST2(root);
		//		System.out.println(ans.min + " " + ans.max + " " + ans.isBST);
		//				System.out.println(searchInBST(root,3));
		//				printBetweenK1K2(root,2,5);
		//		int[] postOrder = {4, 5, 2, 3, 1};
		//		int[] inOrder = {4, 2, 5, 1, 3};
		//		BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder);
		//		printTreeDetailed(root);
		//
		//		BinaryTreeNode<Integer> root = takeInputLevelWise();
		//		System.out.println("Original tree:");
		//		printTreeDetailed(root);
		//		insertDuplicateNode(root);
		//				System.out.println("Tree after inserting duplicate nodes:");
		//				printTreeDetailed(root);
		//
		//		BinaryTreeNode<Integer> root = takeInputLevelWise();
		//		Pair<Integer, Integer> pair = getMinAndMax(root);
		//		System.out.println("Minimum value: " + pair.minimum);
		//		System.out.println("Maximum value: " + pair.maximum);
		//
		//
		//		Scanner s = new Scanner(System.in);
		//		System.out.println("Enter target node");
		//		int target = s.nextInt();
		//		System.out.println("Enter distance k");
		//		int k = s.nextInt();
		//		nodesAtDistanceK(root, target, k);


		//		LinkedListNode<Integer> head = constructLL(root);
		//
		//		// Print the linked list
		//		while (head != null) {
		//			System.out.print(head.data + " ");
		//			head = head.next;
		//		}
		//		int a = 2;
		//		int b = 10;
		//		int lca = getLCA(root, a, b);
		//		System.out.println("LCA of " + a + " and " + b + " is " + lca);
		//		replaceWithLargestNodeSum(root, 0);
		//		printTreeDetailed(root);

		//		ArrayList<Integer> path = nodeToRootPath(root, 15);
		//		if(path == null) {
		//			System.out.println("Not found");
		//		}
		//		else {
		//			for(int i : path) {
		//				System.out.println(i);
		//			}
		//
		//		}
		//		ArrayList<Integer> path = getPath(root, 15);
		//		if(path == null) {
		//			System.out.println("Not found");
		//		}
		//		else {
		//			for(int i : path) {
		//				System.out.println(i);
		//			}
		//
		//		}

		//		ArrayList<LinkedListNode<Integer>> levels = constructLLForEachLevel(root);
		//
		//		for (int i = 0; i < levels.size(); i++) {
		//			LinkedListNode<Integer> head = levels.get(i);
		//			System.out.print("Level " + (i + 1) + ": ");
		//			while (head != null) {
		//				System.out.print(head.data + " ");
		//				head = head.next;
		//			}
		//			System.out.println();
		//		}
		//		int largestBSTSize = largestBSTSubtree(root);
		//		System.out.println("Size of the largest BST subtree: " + largestBSTSize);

		System.out.println("Enter sum");
		Scanner s = new Scanner(System.in);
		int sum = s.nextInt();
		printNodesSumToS(root, sum);










	}

}

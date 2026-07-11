package Tries;

import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;
	
	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
	
}


public class Trie {

	private TrieNode root ;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	
	
	
	
	public boolean isPalindromePair(ArrayList<String> words) {
		for(String word: words) {
			this.add(reverseWord(word));
		}
		return isPalindromePair(root, words);

	}
	
	private String reverseWord(String word) {
		String reverse = "";
		for(int i = word.length() - 1;i>= 0;i--) {
			reverse += word.charAt(i);
		}
		return reverse;
	}
	private boolean isPalindromePair(TrieNode root, ArrayList<String> words) {
		if(words == null || words.size() == 0) {
			return false;
		}
		for(String word : words) {
			if(doesPairExistFor(root,word,0)) {
				return true;
			}
		}
		return false;
	}

	private boolean doesPairExistFor(TrieNode root, String word, int startIndex) {
		
		if(word == "") {
			return true;
		}
		if(startIndex == word.length()) {
			if(root.isTerminating) {
				return true;
			}
			return checkRemainingBranchesInTrie(root, "");
		}
		int charIndex = word.charAt(startIndex) - 'a';
		TrieNode correspondingChild = root.children[charIndex];
		if(correspondingChild == null) {
			if(root.isTerminating) {
				return checkWordForPalindrome(word.substring(startIndex));
			}
			return false;
		}
		return doesPairExistFor(correspondingChild,word,(startIndex + 1));
		
	}

	private boolean checkRemainingBranchesInTrie(TrieNode root, String word) {
		if(root.isTerminating) {
			if(checkWordForPalindrome(word)) {
				return true;
			}
		}
		for(TrieNode childNode : root.children) {
			if(childNode == null) {
				continue;
			}
			String fwd = word + childNode.data;
			if(checkRemainingBranchesInTrie(childNode, fwd)) {
				return true;
			}
				
		}
		return false;
	}





	private boolean checkWordForPalindrome(String word) {
		int startIndex = 0;
		int endIndex = word.length()-1;
		
		while(startIndex < endIndex) {
			if(word.charAt(startIndex) != word.charAt(endIndex)) {
				return false;
			}
			startIndex += 1;
			endIndex -= 1;
		}
		return true;
	}





	public void autoComplete(ArrayList<String> input,String word) {
		for(String w : input) {
			add(w);
		}
		TrieNode node = findRoot(root,word);
		if(node == null || node.childCount == 0) {
			return;
		}
		String output = "";
		allRootToLeafPaths(node,output,word);
	}
	private void allRootToLeafPaths(TrieNode node, String output, String word) {
		if(node.childCount == 0) {
			if(output.length() > 0) {
				
					System.out.println(word + output);
				
			}
			return;
		}
		if(node.isTerminating == true) {
			System.out.println(word + output);
		}
		for(int i = 0;i<node.children.length;i++) {
			if(node.children[i] != null) {
				String ans = output + node.children[i].data;
				allRootToLeafPaths(node.children[i],ans,word);
			}
		}
		
	}
	private TrieNode findRoot(TrieNode root, String word) {
		if(word.length() == 0) {
			return root;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return null;
		}
		
		return findRoot(child, word.substring(1));
	}
	public boolean patternMatching(ArrayList<String> vect, String pattern) {
		for(int i = 0;i<vect.size();i++) {
			String word = vect.get(i);
			for(int j = 0;j<word.length();j++) {
				add(word.substring(j));
			}
		}
		return search(pattern);
	}
	public boolean search(String word) {
		return search(root,word);
		
	}
	
	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		
		return search(child, word.substring(1));
	}
	public void remove(String word) {
		remove(root, word);
	}
	
	private void remove(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminating = false;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return;
		}
		remove(child, word.substring(1));
//		We can remove child node only if it is non terminating and its number of children are 0
		
		if(!child.isTerminating && child.childCount == 0) {
			root.children[childIndex] = null;
			child = null;
			root.childCount--;
		}
		
		
//		if(!child.isTerminating) {
//			int numChild = 0;
//			for(int i = 0;i<26;i++) {
//				if(child.children[i] != null) {
//					numChild++;
//				}
//			}
//			if(numChild == 0) {
////				we can delete child
//				root.children[childIndex] = null;
//				child = null;
//				root.childCount--;
//			}
//		}
		
	}
	public void add(TrieNode root, String word) {
		if(word.length()==0) {
			root.isTerminating = true;
			return ;
		}
		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		
		add(child, word.substring(1));
	}
	
	public void add(String word) {
		add(root, word);
	}
	public int countWords() {
		return root.childCount;
	}
}

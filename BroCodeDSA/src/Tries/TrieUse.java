package Tries;

import java.util.ArrayList;

public class TrieUse {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.add("this");
		t.add("news");
		System.out.println(t.search("news"));
		t.remove("news");
		
		System.out.println(t.search("news"));
		System.out.println(t.countWords());
		
		ArrayList<String> vect = new ArrayList<>();
        vect.add("this");
        vect.add("news");
        String pattern = "news";
        
        System.out.println(t.patternMatching(vect, pattern)); // Checks if pattern is a substring of any word in vect
		
        ArrayList<String> input = new ArrayList<>();
        input.add("hello");
        input.add("help");
        input.add("helmet");
        String word = "hel";
        
        t.autoComplete(input, word); // Prints autocomplete suggestions for words starting with "hel"

        ArrayList<String> words = new ArrayList<>();
        words.add("ab");
        words.add("ba");
        
        System.out.println(t.isPalindromePair(words)); // Should check for palindrome pairs

		
	}

}

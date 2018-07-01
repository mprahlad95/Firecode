package level3;

import java.util.*;

/*Implementing insertWord: 
1) Return if word is null or empty.

2) Create TrieNode cur = root; to iterate over the Trie

3) Get the children of the root : HashMap children = cur.children;

4) In a for loop, iterate over the characters of the input word. If a child node that corresponds to the current character does not exist, create the node and add it to children. If it already exists, simply update children to the children of that node : 
char c = word.charAt(i);
if (children.containsKey(c)) {
 cur = children.get(c);
 } else {
 TrieNode n = new TrieNode(c);
  children.put(c, n);
  cur = n;
}

5) Within the loop, check for the word boundary and update isLeaf accordingly : 
if (i == word.length() - 1) {
 cur.isLeaf = true;
}
 */
public class IntroductiontoTries {
	class TrieNode {
		Character c;
		Boolean isLeaf = false;
		HashMap<Character, TrieNode> children = new HashMap<>();

		public TrieNode() {
		}

		public TrieNode(Character c) {
			this.c = c;
		}
	}

	class Trie {
		private TrieNode root;

		public Trie() {
			this.root = new TrieNode();
		}

		public void insertWord(String word) {
			if (word == null || word.length() < 1)
				return;
			TrieNode cur = root;
			HashMap<Character, TrieNode> children = cur.children;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (children.containsKey(c)) {
					cur = children.get(c);
				} else {
					TrieNode n = new TrieNode(c);
					children.put(c, n);
					cur = n;
				}
				children = cur.children;

				if (i == word.length() - 1) {
					cur.isLeaf = true;
				}
			}
		}

		public Boolean searchWord(String word) {
			TrieNode cur = root;
			HashMap<Character, TrieNode> children = cur.children;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (children.containsKey(c)) {
					cur = children.get(c);
					children = cur.children;
				} else {
					return false;
				}
			}
			return cur.isLeaf;
		}

		public Boolean searchPrefix(String word) {
			TrieNode cur = root;
			HashMap<Character, TrieNode> children = cur.children;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (children.containsKey(c)) {
					cur = children.get(c);
					children = cur.children;
				} else {
					return false;
				}
			}
			return true;
		}
	}
}

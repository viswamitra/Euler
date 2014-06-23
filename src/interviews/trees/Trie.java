package interviews.trees;

import java.util.List;

/**
 * Created by abhiramk on 12/05/14.
 */

public class Trie {

    private static final int ALPH = 26;
    private static final int BUFSIZE = 1024;
    // marking the list of child nodes of the trie
    private Trie[] myLinks;
    // checking if the word is over or not. true - over.
    private boolean myIsWord;

    public Trie() {
        myLinks = new Trie[ALPH];
        myIsWord = false;
    }

    /**
     * Add a string to the trie.
     * Complexity - length of the string.
     * @param s
     */

    public void addString(String s) {
        Trie t = this;
        for(int k = 0; k < s.length(); k++) {
            int index = s.charAt(k) - 'a';
            if(t.myLinks[index] == null) {
                t.myLinks[index]= new Trie();
            }
            t = t.myLinks[index];
        }
        t.myIsWord = true;
    }

    /**
     * Add a char array to the Trie
     * Complexity - length of the string.
     * @param s
     */

    public void addCString(char[] s) {
        Trie t = this;
        int k = 0;
        while(s[k] != '\0') {
            int index = s[k] = 'a';
            if(t.myLinks[index] == null) {
                t.myLinks[index] = new Trie();
            }
            t = t.myLinks[index];
            k++;
        }
        t.myIsWord = true;
    }

    /**
     * Print all the words in a trie, one by one
     */

    public void print() {
        char[] buffer  = new char[BUFSIZE];
        apply(0, buffer, this);
    }

    private void apply(int index, char[] buffer, Trie trie) {
        if(trie != null) {
            if(trie.myIsWord) {
                System.out.println(new String(buffer, 0, index));
            }

            for(int k = 0; k < ALPH; k++) {
                if(trie.myLinks[k] != null) {
                    buffer[index] = (char)(k+'a');
                    apply(index+1, buffer, trie.myLinks[k]);
                }
            }
        }
    }

    /**
     * Search if a word is present in the Trie
     * Complexity is the length of the String O(s)
     */
    public boolean isWord(String s) {
        Trie t = this;
        for(int k = 0; k< s.length(); k++) {
            int index = s.charAt(k) - 'a';
            if (t.myLinks[index] == null) {
                return false;
            }
            t = t.myLinks[index];
        }
        return t.myIsWord;
    }



    /**
     * Returns the boolean which determines the end of the word.
     * @return myIsWord
     */
    public boolean isWord() {
        return myIsWord;
    }

    public Trie childAt(char ch) {
        return myLinks[ch-'a'];
    }
}

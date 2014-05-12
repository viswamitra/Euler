package interviews.trees;

/**
 * Created by abhiramk on 12/05/14.
 */
public class TrieClient {

    public static void main(String[] args) {
        Trie t = new Trie();
        t.addString("abhiram");
        t.addString("anirudh");
        t.addString("cat");

        t.print();
    }
}

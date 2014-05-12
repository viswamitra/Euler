package interviews.trees;

/**
 * Created by abhiramk on 12/05/14.
 */
public class LongestPrefixMatcher {
    public Trie construct() {
        Trie t = new Trie();
        t.addString("are");
        t.addString("area");
        t.addString("base");
        t.addString("cat");
        t.addString("cater");
        t.addString("basement");
        return t;
    }

    public String getMatchingPrefix(Trie t, String input) {
        String result = "";
        for (int level = 0; level < input.length(); level++) {
            
        }

        return "";
    }

    public static void main(String[] args) {
        LongestPrefixMatcher client = new LongestPrefixMatcher();
        Trie trie = client.construct();

        client.getMatchingPrefix(trie, "caterer");
        client.getMatchingPrefix(trie, "basement");
        client.getMatchingPrefix(trie, "are");
        client.getMatchingPrefix(trie, "arex");
        client.getMatchingPrefix(trie, "basemexz");
        client.getMatchingPrefix(trie, "xyz");

    }

}

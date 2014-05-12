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
        int prevMatch = 0;
        for (int level = 0; level < input.length(); level++) {
            char ch = input.charAt(level);
            if(t.childAt(ch) != null) {
                result += ch;
                t = t.childAt(ch);

                if(t.isWord()) {
                    prevMatch = level + 1;
                }
            } else {
                break;
            }

        }

        if( !t.isWord()) {
            return result.substring(0, prevMatch);
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        LongestPrefixMatcher client = new LongestPrefixMatcher();
        Trie trie = client.construct();

        System.out.println(client.getMatchingPrefix(trie, "caterer"));
        System.out.println(client.getMatchingPrefix(trie, "basement"));
        System.out.println(client.getMatchingPrefix(trie, "are"));
        System.out.println(client.getMatchingPrefix(trie, "arex"));
        System.out.println(client.getMatchingPrefix(trie, "basemexz"));
        System.out.println(client.getMatchingPrefix(trie, "xyz"));


    }

}

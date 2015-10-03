package interviews.booking;

import java.io.IOException;
import java.util.*;

/**
 * Created by abhiramk on 27/09/15.
 */
public class Ana2 {
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sin = new Scanner(System.in);
        List<String> listWords = new ArrayList<String>();
        listWords.add("cat");
        listWords.add("dog");
        listWords.add("god");
        listWords.add("tac");
        Map<String, List<String>> dict = new HashMap<String, List<String>>();
//        while(in.readLine()!= null || !in.readLine().equalsIgnoreCase("") || in.readLine().equalsIgnoreCase("\n")) {
//            listWords.add(in.readLine());
//        }

//        while(sin.hasNextLine()) {
//            listWords.add(sin.nextLine());
//        }

        String[] sortAlphabetsInAWord = sortAlphabetsInAWord(listWords);
        List<String> sortedList = Arrays.asList(sortAlphabetsInAWord);

        for(int i =0; i< sortedList.size(); i++) {
            dict.put(sortedList.get(i), new ArrayList<String>());
        }

        for(int i= 0; i< listWords.size(); i++) {
            String wordSorted = sortedList.get(i);
            if(dict.get(wordSorted) != null) {
                List<String> words = dict.get(wordSorted);
                words.add(listWords.get(i));
            }
        }

        for (Map.Entry<String, List<String>> entry : dict.entrySet()) {
            List<String> values = entry.getValue();
            for(int i =0; i< values.size(); i++) {
                if(i < values.size() -1 )
                    System.out.print(values.get(i)+",");
                else
                    System.out.print(values.get(i));
            }
            System.out.println();
        }



    }

    private static String[] sortAlphabetsInAWord(List<String> inputarray){
        String[] retstr = new String[inputarray.size()];
        int i=0;
        for (String s : inputarray){
            retstr[i++] = s;
        }
        i=0;
        for (String s : retstr){
            // Sort characteres of a word and store it in separate array.
            char[] alphword = s.toCharArray();
            Arrays.sort(alphword);
            s = new String(alphword);
            retstr[i++] = s;
        }
        return retstr;
    }

}

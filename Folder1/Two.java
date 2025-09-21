// Count the frequency of each word in a paragraph.
import java.util.HashMap;
class Two {
    public static void main(String args[])
    {
        String para = "This is a sample paragraph. This paragraph is for testing word frequency. Word frequency is important.";
        String[] words = para.split(" ");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for( String word : words )
        {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for( String word : wordCountMap.keySet() )
        {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
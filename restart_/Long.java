// Find the Longest Substring Without Repeating Characters – Given a string, find the longest substring without repeating characters.
import java.util.HashSet;

class Long 
{

    public static void main (String args[])

{

    String str= "abcdeabbsabcde";
    // String long=""
    int max=0;
    HashSet<Character> set= new HashSet<>();
    int left=0;
    StringBuilder sb= new StringBuilder();
    for( int right=0 ; right< str.length() ; right++)
    {
        while ( set.contains( str.charAt(right)))
        {
            set.remove(str.charAt(left));
            left++;
        }
      
        set.add(str.charAt(right));
        max= Math.max( max , right - left +1);

    }    

System.out.println(max+ " ");
}
}
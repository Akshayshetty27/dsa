// Given a string, find the first non-repeating character using HashMap.
import java.util.HashMap;
class One{
    public static void main(String args[])
    {
        String str = "swiss";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for( char c : str.toCharArray() )
        {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for( int i=0 ; i< str.length(); i++)
        {
            if ( charCountMap.get(str.charAt(i)) == 1 )
            {
                System.out.println("First non-repeating character is: " + str.charAt(i));
                break;
            }
        }

        



    }
}
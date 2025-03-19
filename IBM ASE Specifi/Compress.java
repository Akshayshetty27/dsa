import java.util.HashMap;
import java.util.Map;
class Compress
{

    public static void alltogether(String str)
    {

    HashMap<Character , Integer > map  = new HashMap<>();
    for( int i=0 ; i < str.length() -1  ; i++)
    {
        char ch = str.charAt(i);
        int count= Character.getNumericValue(str.charAt(i + 1));
        i++;
        map.put( ch , map.getOrDefault(ch , 0)+ count);
    }

    StringBuilder sb = new StringBuilder();
    for( Map.Entry<Character,Integer> e : map.entrySet())
    {
        sb.append(e.getKey());
        sb.append(e.getValue());
    }
    
    System.out.println(" "+sb.toString());
    }
    public static void main(String args[])
    {
        String str="aabcccccaaa";
// "aabcccccaaa" would become "a2b1c5a3"
int i=0;
StringBuilder sb= new StringBuilder();
       while ( i < str.length())
       {
        char ch = str.charAt(i);
        int count=1;
        int j=i + 1;
        while( j < str.length() && str.charAt(j) == ch)
        {
            count++;
            j++;
        }

        i=j;
        sb.append(ch);
        sb.append(count);
        
       }

       System.out.println(sb.toString());
       alltogether(sb.toString());
    }
}
import java.util.HashMap;
class isomorphic
{
    static boolean isIsomorphic(String str, String str2)
    {
         HashMap<Character,Character> map= new HashMap<>();
        if( str.length() != str2.length())
        {
            return false;
        }
        for( int i=0;i< str.length();i++)
        {
            char ch= str.charAt(i);
            char ch1= str2.charAt(i);
            
            if( map.containsKey(ch) && (ch1 != map.get(ch)))
            {
                return false;
            }
         map.put(ch, ch1);
         
        }
return true;
    }
    public static void main(String args[])
    {
    String str="kill";
    String str2="mess";

    if( isIsomorphic(str, str2))
    {
        System.out.println(" the strings are isomorphic ");

    }else
    {
  System.out.println(" the strings are not isomorphic ");
    }

    }
}
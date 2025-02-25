import java.util.HashMap;
import java.util.Map;

import java.util.HashSet;

class Nonrepeat
{
    public static char findnonrepeat(String str , HashMap<Character ,Integer> map)
    {
        for( int i=0; i< str.length();i++)
        {
            if( map.get((str.charAt(i))) == 1)
            {
                return str.charAt(i);
            }
        }

        return 0;
    }
    public static void main(String args[])
    {
        String str="akshay";
        HashSet<Character> set= new HashSet<>();
        for( int i=0 ; i< str.length();i++)
        {
            char ch = str.charAt(i);
            set.add(ch);
        }
         for( char ch : set)
            {
                System.out.println(" "+ch);
            }
        HashMap<Character ,Integer> map = new HashMap<>();
       
            for( char ch : set)
            {
            int count=0;
             for( int i =0 ;i< str.length();i++)
        
            {
                if(str.charAt(i) == ch )
                {
                    count++;
                }
            }
          map.put(ch, count );
        }


    for( Map.Entry<Character,Integer> e : map.entrySet())
    {
        System.out.println(" "+e.getKey()+" "+e.getValue());
    
        
    }

    System.out.println(" first non repeating character is :"+findnonrepeat(str , map));
}
}
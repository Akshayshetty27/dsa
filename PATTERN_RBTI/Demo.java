import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;


class Demo
{
    public static String string_reverse(String str)
    {
        String str1="";
        for( int i=str.length()-1; i >=0 ; i--)
        {
            char ch=str.charAt(i);
            str1+= ch;  
        }
return str1;
    }

    public static void first_nonrepeat(String str)
    {
        HashSet<Character> set= new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for( int i=0; i< str.length(); i++)
         set.add(str.charAt(i));

        for(char ch : set)
        {
            int count=0;
            for( int i=0; i< str.length(); i++)
            {
                if(ch == str.charAt(i))
                {
                    count++;
                }
            }
            map.put(ch , count);
        }
   
   for( Map.Entry<Character,Integer> e : map.entrySet())
   {
    System.out.println(" "+e.getKey()+" "+e.getValue());
   }

   for( int i=0; i< str.length(); i++)
   {
    if( map.get( str.charAt(i))  == 1)
    {
        System.out.println(" the first non repeating charcater is :"+ str.charAt(i));
        return;
    }
   }

    }


   public static boolean isPalindrome(String str)
   {
    for( int i=0;  i< str.length() / 2 ; i++)
    {
        if( str.charAt(i) != str.charAt(str.length()-i -1))
        {
            return false;
        }
    }
    return true;
   }
    public static void main(String args[])
    {
        String s=string_reverse("akshay");
        System.out.println(" "+s);
        first_nonrepeat("akshay");
        boolean b= isPalindrome("ababaa");
        if( b)
         System.out.println(" the string is palindrome ");
        else
         System.out.println(" the string is not palindrome ");    
         
    }
}
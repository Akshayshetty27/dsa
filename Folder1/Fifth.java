//  In a paragraph check whether  it has anagram  

import java.util.HashMap;
class Fifth
{
    public static boolean  isAnagram( String str1 , String str2)
    {
        HashMap<Character , Integer > charCount1 = new HashMap<>();
        HashMap<Character , Integer > charCount2 = new HashMap<>();
        if ( str1.length() != str2.length())
        {
            return false;
        }else{
            for(int i=0 ; i< str1.length(); i++)
            {
                char ch1= str1.charAt(i);
                char ch2= str2.charAt(i);
                charCount1.put(ch1, charCount1.getOrDefault(ch1 , 0)+1) ;
                charCount2.put(ch2, charCount2.getOrDefault(ch2 , 0)+1) ;
            }
        }
return charCount1.equals(charCount2);        
    }
    public static void main(String args[])
    {
        String para ="The man is listen  in silent";
        String arr[]= para.split(" ");
        for( int i=0; i<arr.length ; i++)
        {
            for( int j= i+1 ; j< arr.length ; j++)
            {
                if( isAnagram(arr[i] , arr[j]))
                {
                    System.out.println(arr[i]+" and  "+ arr[j]+" are Anagram");
                }else{
                     System.out.println(arr[i]+" and  "+ arr[j]+" are not Anagram");
                                   }
            }
        }

    }
}
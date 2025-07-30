class Sixth
{

    public static int strStr(String haystack, String needle) {
        int s = needle.length() ;
        int h = haystack.length() ;
    for( int i=0 ; i< h  - s ; i++)
    {
        if( haystack.substring(i , i + s ).equals(needle) )
        {
            return i;
        }

    }
        return -1;
        
    }

    public static void main(String[] args)
    {
    String haystack = "hello";
    String needle = "ll";
    int index = strStr(haystack, needle);
    System.out.println("Index of first occurrence: " + index);
    }
}
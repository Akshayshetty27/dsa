class Palindrome
{
    public static void main(String args[])
    {
        String str="akska";
        for( int i=0; i< str.length();i++)
        {
            if( str.charAt(i) != str.charAt(str.length()-i-1))
            {
                System.out.println(" the string is not  palindrome ");
                System.exit(0);
            }
        }
           System.out.println(" the string is palindrome ");
    }
}
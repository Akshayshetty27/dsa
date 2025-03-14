class Anagram
{
    public static void main(String args[])
{
    String str ="listen";
    String str2 = "silent";

    char arr[]= new char[256];
    if( str.length() != str2.length())
    {
        System.out.println(" not anagram");
        return;
    }

    for( int i=0 ; i< str.length();i++)
    {
        arr[str.charAt(i)]++;
        arr[str2.charAt(i)]--;
    }

    for( int c : arr)
    {
        if(c != 0 )
        {
            System.out.println(" nno an anagram");
            return;
        }
    }
    System.out.println(" anagram");
}
}
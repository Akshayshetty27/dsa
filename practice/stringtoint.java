class stringtoint{
    public static void main(String args[])
    {
    String str= "aabaa";

    for(int i=0;i<str.length()/2 ;i++)
    {
        char first=str.charAt(i);
        char last=str.charAt( str.length() - i -1);

        if( first != last )
        {
         System.out.println("not a palindrome");
          System.exit(0);
        }

    }
    System.out.println(" palindrome string ");
   
    }
}
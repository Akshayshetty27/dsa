class Jeverse{

    static public int secondlarge(int arr[])
    {
        int large= arr[0];
        int secl=0;

        for( int i=0; i< arr.length ; i++)
        {
            if(  arr[i] > large )
            {
                secl= large;
                large = arr[i];
            }else if(arr[i] < large  && arr[i]> secl)
            {
                secl = arr[i];
            }
        }

return secl;
    }

    static boolean palindrome(String str )
    {
      for( int i=0; i< str.length()/ 2 ; i++)
      {
        if( str.charAt(i) != str.charAt(str.length()- 1-i))
        {
            return false;
        }else{
            continue;
        }
      }
return true;
    }

    static int vowelscount( String str )
    {
        int count=0;
        String str1= str.toLowerCase();
        for( int i=0; i < str1.length(); i++)
        {
if( str1.charAt(i)  == 'a' || str1.charAt(i)== 'e' || str1.charAt(i)== 'i' || str1.charAt(i)== 'o' || str1.charAt(i)== 'u' )
{
    count++;
}
        }

        return count;
    }
    public static void main(String args[])
    {
        String str= "AEiouuoiEA";
        String rev="";
        for(int i=0; i< str.length(); i++)
        {
            rev += str.charAt(str.length() - i- 1);
        }
        System.out.println(" "+rev);

        int arr[] = { 3,5,6,7,8,9,9};

        System.out.println(secondlarge(arr));
        System.out.println(palindrome(str));
        System.out.println(vowelscount(str));


    }
}
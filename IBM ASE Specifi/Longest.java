class Longest
{
     public static  boolean checkpal(String s)
    {
        for( int i=0 ; i< s.length() /2 ; i++)
        {
            if( s.charAt(i) != s.charAt(s.length() - 1 -i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str= "babdba";
        String max=""+str.charAt(0);

        for( int  i=0 ; i< str.length() ; i++)
        {
            for(int j= str.length() - 1 ; j > i ; j--)
            {
                String temp = str.substring(i , j + 1);
                if( checkpal(temp) && temp.length() > max.length())
                {
                    max=temp;

                }
            }
        }
        System.out.println(" "+max);
    }
}
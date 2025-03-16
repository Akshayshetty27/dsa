class Ritation
{
    public static void main(String args[])
    {
        String str1 = "coding"  ;
        String str2 = "ingcod" ;

        for( int i =0 ;i< str2.length();i++)
        {
            String temp= str2.substring(i ,str2.length() ) + str2.substring(0 , i) ;
           
            if( temp.compareTo(str1) == 0)
            {
                 System.out.println(" "+temp);
                System.out.println(" it is rotated string ");
                return;
            }
        }

        System.out.println(" not a rotated string ");
    }
}
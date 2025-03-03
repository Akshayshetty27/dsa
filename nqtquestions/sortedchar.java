class sortedchar
{
    public static void main(String args[])
    {
        String str="aabbcde";

        int l=0; 
        int r=1;
        StringBuilder newstr=new StringBuilder();

        newstr.append( str.charAt(0));
        while( r < str.length())
        {
            char left= str.charAt(l);
            char right = str.charAt(r);
            if( left == right)
            {
                r++;
                continue;
            }else{
                newstr.append( right);
                l=r;
                r++;
            }

        }

        System.out.println(" "+newstr);

    }
}
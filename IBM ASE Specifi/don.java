class Don
{
    public static void main( String args[])
    {
        String str="ppppp|pp#pp";
        String s[]= str.split("[|#]");
        int min=s[0].length();

        for( String st : s)
        {
            System.out.println(" "+st);
            if(st.length() < min)
             min=st.length();
        }
    System.out.println(" "+min);
    }
}
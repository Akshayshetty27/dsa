import java.util.*;
class nextperm
{
    static void swap(String st, String str)
    {
        if(str.isEmpty())
        {
            System.out.println(" "+st);
            return;
        }
        char ch = str.charAt(0);
        for( int i=0; i<=st.length();i++)
        {
            String s1= str.substring(0,i);
            String s2= str.substring(i, st.length());
            swap(s1+ch+s2 , str.substring(1));
        }
    }
    public static void main(String args [])
    {
        // generate all the possible combination
        // linear-search 
        // return the next permu

swap("","ABC");

    }
}
import java.util.ArrayList;
class subset 
{
    public static void main(String args[])
    {
        String str="";
        subseq("","abc");
        ArrayList<String> s= new ArrayList<String>();
        System.out.print(" "+subseql(" ","absbss", s ));
    }
    static void subseq(String p , String up)
{
    if( up.isEmpty())
    {
        System.out.println(p);
        return;
    }

    char ch=up.charAt(0);
    subseq(p+ch , up.substring(1));
    subseq(p , up.substring(1));
    }
        static ArrayList<String> subseql(String p , String up , ArrayList<String> s)
{
    if( up.isEmpty())
    {
        s= left+rigth;
        return s;
    }

    char ch=up.charAt(0);
    ArrayList<String> left=subseql(p+ch , up.substring(1));
   ArrayList<String> right= subseql(p , up.substring(1));
    }

}
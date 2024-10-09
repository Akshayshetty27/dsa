class ascii
{
    public static void main(String args[])
    {
printascii("" ,"abcd");
    }
    public static void printascii(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(" "+p);
            return;

        }

        char ch= up.charAt(0);
        printascii(p + ch , up.substring(1));
        printascii(p, up.substring(1));
        printascii(p+ (ch + 0) , up.substring(1));
    }
    
}
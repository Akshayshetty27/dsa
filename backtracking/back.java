class back
{
    public static void printperm(String str,int index,String perm)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currnt=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printperm(newstr,index+1,perm+currnt);
        }
    }
    public static void main(String args[])
    {
        String str="ABC";
        printperm(str,0,"");
    }
}
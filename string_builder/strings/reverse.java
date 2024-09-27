// import java.util.Scanner;
class reverse{
    public static void main(String args[])
    {
        int i;
        StringBuilder str=new StringBuilder("emoh og nam");
       
        for(i=0;i<str.length()/2;i++)
        {
            int front=i;
            int back=str.length()-1-i;
            char first=str.charAt(front);
            char last=str.charAt(back) ;
            str.setCharAt(back,first);
            str.setCharAt(front,last);         
        }
System.out.println(" the reverese of the string is : "+str);
    }
}
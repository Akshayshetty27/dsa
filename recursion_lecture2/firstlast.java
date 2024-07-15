import java.util.Scanner;
class firstlast{
public static int first=-1;
public static int last=-1; 
public static void firstlastocc(String str, int index,char ch)
{
    if(index==str.length())
    {
        System.out.println(" first occurence "+ first +" last occurance "+last);
        return;
    }
char curentchar = str.charAt(index);
if(curentchar == ch)
{
    if(first==-1)
     {
        first=index;
}
else{
    last=index;
}
}
firstlastocc(str,index+1,ch);
}


public static  void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str;
System.out.println("enter a string ");
str=sc.nextLine();
firstlastocc(str,0,'a');

}
}
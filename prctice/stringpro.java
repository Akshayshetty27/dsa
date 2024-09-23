
import java.util.Scanner;

class stringpro
{
    public static int factorial(int num)
    {
        if(num==0 || num==1)
         return 1;
        else 
        return num * factorial(num -1);
    }
      public static void main(String args[])
    {
Scanner sc= new Scanner(System.in);
String str,str2="";
System.out.println("enter string");
str=sc.next();
for(int i=0;i<str.length();i++)
 {
    char ch=str.charAt(i);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
      str2 +=ch;
    }
 }
 int diff= str.length() - str2.length();

 System.out.println("the possible combinaton of string are: "+factorial(diff));
 
    }

}
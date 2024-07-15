import java.util.Scanner;
class movex
{
    static void  moveallx(String str,int index,int count,String newstr)
    {
        char curr=str.charAt(index);
        if(index == str.length()-1)
        {
        
            for(int i=0;i<count;i++)
            {
                newstr=newstr+'x';
            }
                System.out.println(" "+newstr);
            return;
        }
        if(curr=='x')
        {
            count++;
            moveallx(str,index+1,count,newstr);
        }
        else{
            newstr=newstr+curr;
            moveallx(str,index+1,count,newstr);
        }


    }  
public static  void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str,str2;
int index,count;
System.out.println(" enter the string");
str=sc.next();
moveallx(str,0,0,"");

    }
}
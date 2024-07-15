import java.util.Scanner;
class remove
{
    static void removedup(String str,int index,String newstr)
    {
        char curr=str.charAt(index);
        if(index==str.length()-1)
        {
            System.out.println(" "+newstr);
            return;
    }else{
        if(curr==str.charAt(index+1))
        {
             removedup(str,index+1,newstr);
  
        }
        else
        {
            newstr +=curr;
            removedup(str,index+1,newstr);

        }
         
    }
    
    

    }  
public static  void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str,str2;
int index,count;
System.out.println(" enter the string");
str=sc.next();

removedup(str,0,y);

    }
}
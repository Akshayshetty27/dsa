// important for interview 
import java.util.Scanner;
import java.util.HashSet;

class subsequence
{

    public static void sub(String str ,int index , String newstr,HashSet<String> set)
    {
        if(index == str.length())
        {   
            if(set.contains(newstr))
            {
                return;
            } else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
char curr=str.charAt(index);
//  to be in sequence
sub(str,index+1,newstr+curr,set);
    
    //  not to be in sequence
    sub(str,index+1,newstr,set);
    }
    public static  void main(String args[])
{
Scanner sc= new Scanner(System.in);
String str;
HashSet<String> set =new HashSet<>();
sub("aaa",0,"",set);

}
}
import java.util.Scanner;
import java.util.HashSet;
class keyboard{
public static String[] keypad = {"_","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

public static void printstr( String str , int index,String comb)
{
    if(index==str.length()){
        System.out.println(comb);
        return;
    }
char curr= str.charAt(index);
String mapping=keypad[curr-'0'];

for(int i=0;i<mapping.length();i++)
 printstr(str,index+1,comb+mapping.charAt(i));
}

public static  void main(String args[])
{
Scanner sc= new Scanner(System.in);
printstr("26",0,"");
}
}

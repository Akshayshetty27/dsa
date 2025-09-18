
import java.util.Scanner;

class  Fourteen{
    
    public static  int lengthOfLastWord(String s) {
    String str[] =  s.split(" ");
    int n = str.length - 1 ;

    return str[n].length();   
    
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String s = sc.nextLine();

            System.out.println("Length of last word is : " + lengthOfLastWord(s));
            
    }
}
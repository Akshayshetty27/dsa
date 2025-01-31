import java.util.Stack;
import java.util.Scanner;
class balancedbracket{
    public static boolean check( String str)
    {
         Stack<Character> st= new Stack<>();
        
 for(int i=0; i< str.length(); i++)
 {
    if( str.charAt(i)== '(')
    {
        st.push('(');
    }else if(st.isEmpty()){
        return false;
    }else{
        st.pop();
    }
 
 }
   return st.isEmpty();
    }
    public static void main(String args[])
    {

Scanner sc= new Scanner(System.in);
    System.out.println("enter string ");

 String str= sc.next();
 if(check(str))
 {
    System.out.println(" it is  right level");
 }else{
      System.out.println(" it is  in not right level");
  
 }

    }
}
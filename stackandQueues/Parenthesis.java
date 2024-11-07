import java.util.Stack;
class Parenthesis
{
    public static void main(String args[])
{
Stack<Character> stack= new Stack<>();
String str= "{({})}";
for(int i=0;i<str.length();i++)
{
    if( str.charAt(i)== '{' || str.charAt(i)== '(' || str.charAt(i)=='[')
    {
        stack.push(str.charAt(i));
    }
}

for(int i=0;i<str.length();i++)
{
    if( str.charAt(i)== '}')
    {
        char ch= stack.pop();
        if( ch != '{')
        {
          System.out.println(" the order is not matching ");
          System.exit(0);
        }
    }else if( str.charAt(i)== ')' )
    {
        char ch= stack.pop();
        if( ch!= '(')
        {
 System.out.println(" the order is not matching ");
          System.exit(0);
        }
    }else if(  str.charAt(i)==']')
    {

        char ch= stack.pop();
        if( ch!= '[')
        {
 System.out.println(" the order is not matching ");
          System.exit(0);
        }
    }
}

 System.out.println(" the order is  matching ");
       
}
}
import java.util.Stack;
class Parenthesis{
    public static void main(String args[])
    {
        String str="}{(())[]}";
        Stack<Character> stack = new Stack<>();
        for( int i=0; i< str.length(); i++)
        {
            char ch= str.charAt(i);
            if( ch == '{' || ch == '(' || ch=='[')
            {
                stack.push(ch);
            }else if( ch == '}' || ch == ')' || ch==']')
            {
                  if( stack.isEmpty())
                  {
                   System.out.println(" the Parenthesis is not in  right order  "); 
                   return;
                  }else
                  {
                    stack.pop();
                  }
            }
        }
        
        if( stack.isEmpty())
        {
            System.out.println(" the Parenthesis is in right order  ");
        }else{
                        System.out.println(" the Parenthesis is not in  right order  ");
        }
    }
}
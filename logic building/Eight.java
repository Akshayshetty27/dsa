// Check if a string of parentheses is balanced (e.g., “({[]})”).


import java.util.Stack;
class Eight
{
    public static void main( String args[])
    {
        Stack <Character>  stack = new Stack<>();
        String s ="()";
        for( int i=0; i < s.length() ; i ++)
        {
            if(s.charAt(i) ==  '(' || s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '<' )
            {
                char ch = s.charAt(i) ; 
                stack.push(ch);
            }
            if( s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == '>' )
            {
                stack.pop();
            }

        }

        if( stack.isEmpty()  )
        {
            System.out.println(" the bracket are evenly balanced");
        }else
        {
           System.out.println(" the bracket are odly balanced"); 
        }
    }
}
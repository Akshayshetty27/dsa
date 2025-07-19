import java.util.Stack;
class First
{
    
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        Stack<Character> stack = new Stack<>();
        String str = "{(})";

        for( int i=0; i< str.length();i++)
        {
            if(str.charAt(i)=='{' || str.charAt(i) == '(' ||  str.charAt(i) == '[')
            {
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)=='}' || str.charAt(i) == ')' ||  str.charAt(i) == ']')
            {
                stack.pop();
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }

    }
}
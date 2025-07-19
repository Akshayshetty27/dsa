import java.util.Stack;
class Second
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(9);
        stack.push(5);
        stack.push(7);

        int min =stack.get(1);
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        for( int i = 0; i < stack.size(); i++)
        {
            if( stack.get(i) < min)
            {
                min = stack.get(i);
            }
        }

        System.out.println("Minimum element in the stack is: " + min);
    }
}
import java.util.*;
public class recursion
{
    public static void pushatBottom(int data ,Stack<Integer> s)
    {

        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int  top=s.pop();
        pushatBottom(data,s);
        s.push(top);
    }
        public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        pushatBottom(1 ,s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
}
        }
}
import java.util.*;
class que
{
    public static void main (String args[])
    {
        //  operations  1) add 2) remove  3) peek
        //   First In First Out
Queue<Integer> s = new PriorityQueue<>();
s.add(1);
s.add(2);
s.add(3);
while(!s.isEmpty())
{
    System.out.println(s.peek());
   System.out.println(" removed element "+ s.remove());
}
    }
}
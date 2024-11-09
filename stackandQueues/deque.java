import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
class deque

{  
    public static void main(String args[])
    {

  Deque<Integer> deq= new ArrayDeque<>();
  deq.add(5);
  deq.addLast(4);

  System.out.println(" removing first "+deq.removeFirst());
  deq.addFirst(7);

    }
}
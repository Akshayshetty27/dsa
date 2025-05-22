import java.util.Stack;
public class ReverseList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

 public void print()
    {
        if( head == null)
        {
            System.out.println(" the   list is null ");
            return;
        }

        Node temp = head;
        while( temp != null)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
        }

    }
    public void reversePrint() {
        Stack<Integer> st = new Stack<>();

        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

    
        while (!st.isEmpty()) {
            System.out.println(" "+st.pop());
        }
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println(" in reverse order ");
        list.reversePrint();
    }
}

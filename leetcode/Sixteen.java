class Sixteen{
     static public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
     static ListNode deleterepeated(ListNode head)
     {
        ListNode current = head;
        while (current != null && current.next != null) {   
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
         return head;
     }
    public static void main (String args[])
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        ListNode temp = head;
        System.out.println("Linked list:");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        ListNode newhead = deleterepeated(head);
        System.out.println("\nLinked list after removing duplicates:");
         temp = head;
        System.out.println("Linked list:");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

   
}
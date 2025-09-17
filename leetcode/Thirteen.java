class Thirteen {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next; 
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        ListNode temp = head;
        System.out.println("Original list:");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        Thirteen solution = new Thirteen();
        ListNode modifiedList = solution.removeNthFromEnd(head, n);

        ListNode current = modifiedList;
        System.out.println("\nList after removing " + n + "th node from end:");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

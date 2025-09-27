import java.util.Scanner;
class Sixth {
    static Node head = null;

    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void insert(String data) {
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


    public static void display() {
        if (head == null) {
            System.out.println("No element in the list");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void  delete()
    {
        if( head == null)
        {
            System.out.println(" the list is Empty");
            return;
        }
        Node temp = head;
        while ( temp.next.next != null)
        {
            temp = temp.next;
        }
        System.out.println(" deleted data :"+temp.next.data);
        temp.next = null;
    }

    public static void main(String args[]) {
        insert("Laksh");
        insert("Kumar");
        insert("Linked List");
        display();
        delete();
        display();
        
    }
}

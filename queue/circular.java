// import java.util.*;
// class circular
// {
//    public static class Queue
//     {
//         static int data;
//         static int front=-1;
//         static int rear=-1;
//         Queue(int n)
//         {
//             arr=new int[n];
//             this.size=n;

//         }

//         public static boolean isempty()
//         {
//             return front==-1 && rear==-1 ;

//         }

//         public static boolean isfull()
//         {
//             return (rear+1)%size ==front ;

//         }

//         public static void add(int data)
//         {
//          if(isfull())
//          {
//             System.out.println(" the Queue is Full ");
//             return;
//          }
//         //   first element add
//         if(front==-1)
//         {
//             front=0;
//         }
//          rear= (rear +1)% size;
//          arr[rear]=data;
//         }
//         public static int remove()
//         {
//             if(isempty)
//             {
//                 System.out.println(" the Queue is empty");
//                 return -1;
//             }
//             int result=arr[front];
//             if(rear== front)
//             {
//                 rear=-1;
//                 front=-1;
//             }
//             else
//             {
//                 front=(front+1 %size);
//             }
// return result;
            
//         }


      
//     }

//     public static void main(String args[])
//     {
// Queue qu= new Queue();
// qu.add(1);
// qu.add(2);
// qu.add(3);
// while(!q.isempty()) 
// {
//     System.out.println(qu.peek());
//     qu.remove();
// }   }}
import java.util.*;

class circular {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    circular(int n) {
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("The Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        }
        int result = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String args[]) {
        CircularQueue qu = new CircularQueue(5);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        qu.add(7);

        while (!qu.isEmpty()) {
            System.out.println(qu.peek());
            System.out.println("removed element "+qu.remove());
        }
    }
}

 import java.util.Scanner;
 class Staxk
{
    static int top=-1;
    static int size=10;
 static int arr[]=new int[size];
    static void push(int data)
    {
        if( top< size -1)
        {
            arr[++top]=data;
        }
    
    }
    static int  pop()
    {
        if( top == -1)
        {
            System.out.println(" underflow");
            return -1;
        }
        return arr[top--];
    }

    static void display()
    {
        int st= top;
        while( st >-1)
        {
            System.out.println(" "+arr[st]);
            st--;
        }
    }

    public static void main(String args[])
    {
        Staxk st= new Staxk();
        Scanner sc= new Scanner(System.in);
        int choice;
        int n;
        while(true){
            System.out.print(" 1.push  2. pop  3. display ");
            choice=sc.nextInt();
          switch(choice){

           case 1: 
            System.out.println(" enter the element ");
            n= sc.nextInt();
            st.push(n);
            break;
        case 2: 
             st.pop();
           break;
        case 3: 
            st.display();
        break;
       default:
        System.exit(0);       

          }

        }
        
    }
}
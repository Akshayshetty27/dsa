import java.util.Scanner;
public class exeercise{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,b;
         System.out.println("enter  two number \n");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
        {
            System.out.println(" a and b are equal ");
        }
        else
        { 
            if(a>b)
        {
             System.out.println(" a is greater than b");
        }
        else{
             System.out.println("a is smaller than b");
        }
            }

    }
}
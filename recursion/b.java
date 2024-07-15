import java.util.Scanner;
class b{
    
    static int factorial(int n)
    {
if(n==0 || n==1)
{
    return 1;

}
else{
    return n*factorial(n-1);
    }
    }



static void fibbanacci(int fib1,int fib2,int n)
{

if(n==0)
 return;
int fib=fib1+fib2;
System.out.print(" "+fib);
fibbanacci(fib2,fib,n-1);

}

    
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number ");
        int n=sc.nextInt();
        System.out.println(" the factorial "+n+" is :"+factorial(n));
        System.out.println(" fibbanacci series :");
        int fib1=0,fib2=1,fib;
        int i;
        System.out.print(" "+fib1+" "+fib2);
        for(i=0;i<n-2;i++)
        {
             fib=fib1+fib2;
             System.out.print(" "+fib);
             fib1=fib2;
             fib2=fib;
                     }
                     System.out.println(" ");
                     System.out.println(" fibbanacci using recursion");
fib1=0;
fib2=1;
                      System.out.print(" "+fib1+" "+fib2);
                      fibbanacci(fib1,fib2,n-2);



    }

}
import java.util.Scanner;
class aa{

    static void printnum(int start,int n)
    {
      
       System.out.println(" "+start);
       if(start<n)
        printnum(start+1,n);
       

    }

    static void sumof(int n,int i,int sum)
    {
      if(i==n)
      {
        sum+=i;
        System.out.println("sum of first "+ n+"  natural number is :"+sum);
        return;
      }
      sum+=i;
      sumof(n,i+1,sum);
      System.out.print(" "+i);

    }

     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
//   two main concepts used in the recursion   
//  iteration     and   function
int n;
System.out.println(" enter the number ");
n=sc.nextInt();
// System.out.println(" factorial : "+factorial(n));5
System.out.println(" printing the number ");
printnum(1,n);


System.out.println(" printing sum of first natural numbers");
sumof(n,1,0);
    }
}
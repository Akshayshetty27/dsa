import java.util.Scanner;
public class g{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
System.out.println(" enter the value of n m");
m=sc.nextInt();
 for(i=m;i>=0;i--)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(" "+j);

        }
        System.out.println("");
    }
    }

}
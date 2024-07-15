import java.util.Scanner;
public class h{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        int k=0;
System.out.println(" enter the value of n m");
m=sc.nextInt();
 for(i=1;i<=m;i++)
    {
        for(j=1;j<=i;j++)
        {
            k=k+1;
            System.out.print(" "+k);

        }
        System.out.println("");
    }
    }

}
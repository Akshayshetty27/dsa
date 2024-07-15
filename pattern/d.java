import java.util.Scanner;
public class d{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
System.out.println(" enter the value of n m");
m=sc.nextInt();
 for(i=m;i>=0;i--)
    {
        for(j=1;j<i+1;j++)
        {
            System.out.print(" *");

        }
        System.out.println("");
    }
    }

}
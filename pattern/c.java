import java.util.Scanner;
public class c{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
        System.out.println(" enter m,n");
        m=sc.nextInt();
        n=sc.nextInt();
    for(i=1;i<=m;i++)
    {
        for(j=1;j<i+1;j++)
        {
            System.out.print(" *");

        }
        System.out.println("");
    }
    }
}
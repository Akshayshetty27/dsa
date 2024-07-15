import java.util.Scanner;
public class e{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
System.out.println(" enter the value of n ");
m=sc.nextInt();

 for(i=1;i<=m;i++)
    {
        for(j=1;j<=m-i;j++)
        {
            System.out.print("  ");

        }
        
         for(int l=1;l<i+1;l++)
        {
            System.out.print(" *");
        }
        System.out.println("");
        
    }
}
}
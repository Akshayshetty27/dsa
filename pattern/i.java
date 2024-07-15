import java.util.Scanner;
public class i{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
System.out.println(" enter the value of  m");
m=sc.nextInt();
 for(i=1;i<=m;i++)
    {
        for(j=1;j<=i;j++)
        {
            if((i+j)%2==0 )
             System.out.print(" 1");
            else
             System.out.print(" 0");

        }
        System.out.println("");
    }
    }

}
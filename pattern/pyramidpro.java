//  pyramid pattern

import java.util.Scanner;
public class pyramidpro{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,n;
System.out.println(" enter the value of  m");
m=sc.nextInt();

for(i=1;i<=m;i++)
{
    for(j=1;j<=m-i;j++)
    {
        System.out.print("  ");
    }
    for(j=i;j>=1;j--)
    {
        System.out.print(" "+j);
    }
    for(j=2;j<=i;j++)
    {
        System.out.print(" "+j);
    }
    System.out.println("");
}

    }
}
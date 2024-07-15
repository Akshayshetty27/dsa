import java.util.Scanner;
class fibanacci
{
    public static void fibb( int n)
    {
        int sum=1,i;
        for(i=0;i<=n;i++)
{
    sum=sum+i;
    System.out.print(" "+sum);

}
    }
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n;
System.out.println(" enter the nmber ");
n= sc.nextInt();
System.out.println(" the finacci series :");
fibb(n);
}
}
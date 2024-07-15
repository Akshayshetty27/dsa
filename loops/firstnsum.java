import java.util.Scanner;
class firstnsum{
    public static void main(String args[])
    {
Scanner sc= new Scanner(System.in);
int n,i;
System.out.println(" enter the number \n");
n=sc.nextInt();
int sum=0;
for(i=0;i<n;i++)
{
    sum=sum+(i+1);
}   
System.out.println(" the sum of first"+n+" number is : "+sum);
 }
}
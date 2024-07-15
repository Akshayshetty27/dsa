import java.util.Scanner;
class oalindrome
{
    public static void main(String args[])
    {
Scanner sc= new Scanner(System.in);
System.out.println(" enter the number ");
int num=sc.nextInt();
int r,rev=0;
int temp=num;
while(num>0)
{
    r=num%10;
    rev=rev*10+r;
    num=num/10;
    
}

if(temp==rev)
{
    System.out.println(" the number is palindrome");}
    
    else
         System.out.println(" the number is not palindrome");

}}
import java.util.Scanner;

class binary{
    public static void main(String args[])
{
int  binar;
int decimal=1;
int count=1;
int i;
int num=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter binary number : ");
binar=sc.nextInt();
int nums=binar;
while(nums>0)
{
    nums=nums/10;
    num=num+1;
    }
for(i=num;i>0;i--)
{ 
    int r=binar%2;
    decimal= r  *( Math.pow(2,count)); 
    count++;
    binar=binar/10;
    }
    System.out.println(" "+decimal);

}
}
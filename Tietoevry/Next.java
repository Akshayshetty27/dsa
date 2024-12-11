import java.util.Scanner;
import java.util.Arrays;
class Next 
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a[]={4,5,2,25};    
for( int i=0; i<4;i++)
{
System.out.print(a[i]);
if( i== 3)
{
System.out.print("-> -1");
break;
}
for(int j=i+1;j<4;j++)
{    
if( a[i] < a[j])
{
System.out.println("->"+a[j]);
break;
}
}
}
}
}


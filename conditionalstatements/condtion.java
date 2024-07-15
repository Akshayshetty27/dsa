import java.util.Scanner;
public class condtion{
    public static void main(String args[])
    {
//  conditional statements are 
// 1) if    2) if else  3)  switch  4) break 
Scanner sc= new Scanner(System.in);
System.out.println(" enter tge age  ");
int age=sc.nextInt();
if(age>=18)
{
    System.out.println(" he is adult ");
}
else{
    System.out.println(" he is child ");
}

    }
}
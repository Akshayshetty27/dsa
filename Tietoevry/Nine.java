import java.util.Scanner;
class Nine
{

static boolean canshetop(int m,int d,int n,int marks[],int time[])
{
int sum=0;
int t=0;
     for(int i=0;i<n;i++)
    {
        sum = marks[i];
        t=time[i];
        if( sum== m && t<=d){
            return true;
        }
        for(int j=i+1;j<n;j++)
        {
            sum+=marks[j];
            t+=time[j];
            if( sum > m || t > d)
            { 
                break;
            }
            if( sum == m && t<=d )
            {
                return true;
            }
            
        }
    }
    return false;
}

    public static void main(String args[])
    {
    Scanner sc= new Scanner (System.in); 
      System.out.println(" enter the duration");
    int d=sc.nextInt();
      System.out.println(" enter the secret mark");
    int m=sc.nextInt();
    System.out.println(" enter the number of question");
    int n= sc.nextInt();
    int marks[]= new int[n];
    int time[]= new int[n];

    System.out.print(" enter the marks");
    for(int i=0; i< n;i++)
     marks[i]=sc.nextInt();
    System.out.print(" enter the time to solve each ques");
    for(int i=0; i< n;i++)
     time[i]=sc.nextInt();
    
boolean check=canshetop(m,d,n,marks,time);
if(check)
{
    System.out.println("Yes");
}
else
System.out.println("No");

    }
}
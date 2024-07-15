import java.util.Scanner;
//  it is one of the common question asked in the interview
class tower{
    public static void  towerofhanoi(int n,String source,String help, String dest)
{
    
    if(n==1)
    {
         System.out.println(" tranfer "+n +" from "+source+" to "+dest);
         return;
    }
    towerofhanoi(n-1,source,dest,help);
    System.out.println(" tranfer "+n +" from "+source+" to "+dest);
    towerofhanoi(n-1,help,source,dest);

}
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println(" enter the number of disk");
        num=sc.nextInt();
        towerofhanoi(num,"A","B","C");



    }

}
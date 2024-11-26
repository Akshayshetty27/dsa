import java.util.Scanner;
class saddle{
   public static boolean does_itMax(int arr[][],int row,int max)
   {
    System.out.println(" the max "+max+" row:"+row);
    for(int j=0;j<3;j++)
    {
        if(arr[j][row] > max)
        {
            return false;
        }
    }
    return true;
   }
    public static void main(String args[])
    {
        int arr[][]= new int[3][3];
        Scanner sc= new Scanner(System.in);
        for( int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
int row=0;
int col=0;
        for(int i=0;i<3;i++)
        {
            int min=arr[i][0];
            for(int j=0; j<3;j++)
            {
             if( arr[i][j] < min)
             {
                min=arr[i][j];
                System.out.println(" "+min+" "+row);
                row=i;
                col=j;
             }    
            }
            boolean c=does_itMax(arr,row,min);
            System.out.println(" "+c);
            if(does_itMax(arr,row,min))
            {
                System.out.println("saddle element is :"+min);
            }
        }
    }
}
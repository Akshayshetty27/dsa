import java.util.Scanner;
class Spiral{
    public static void main(String args[])
     {
        int arr[][]=new int[5][5];
        int b[][]=new int[5][5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
         for(int j=0; j<5;j++)
         {
            arr[i][j]=sc.nextInt();
         }
        }

        int left=0,right=4;
        int top=0,bottom=4;

        // right
        for(int i=left; i<right;i++)
        {
            b[top][i]= arr[i][]
        }
     }
}
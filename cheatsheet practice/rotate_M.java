import java.util.Scanner;
class rotate_M
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
       int  matrix[][]= new int[4][4];
       int ans[][]= new int[4][4];
       int m=4;
      int  n=4;
      System.out.println(" enter the matrix element ");
       for( int i=0; i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            matrix[i][j]= sc.nextInt();
        }
       }

       for( int i=0 ; i< m; i++)
       {
        for( int j=0; j< n;j++)
        {
            ans[j][m-1-i]= matrix[i][j];
        }
       }

       for(int i=0; i<m;i++)
       {
                for( int j=0; j< n;j++)
        {
            System.out.print(" "+ans[i][j]);

        }
        SySPiral.stem.out.println("");
       }
    
    }
}
import java.util.Scanner;
class zero
{
    static void set_to_minus(int arr[][], int i ,int j)
    {
        for(int k=0;k<4;k++)
        {
            arr[i][k]=-1;
        }
        for(int m=0;m<4;m++)
        {
            arr[m][j]=-1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int arr[][]= new int[4][4];
      System.out.println( "enter matrix element");
     for( int i=0; i< 4; i++)
     {
        for(int j=0; j< 4;j++)
        {
            arr[i][j]=sc.nextInt();
        }
     }
   for( int i=0; i< 4; i++)
     {
        for(int j=0; j< 4;j++)
        {
            if( arr[i][j] == 0)
            {
                set_to_minus(arr,i,j);
            }
        }

     }

 for( int i=0; i< 4; i++)
     {
        for(int j=0; j< 4;j++)
        {
            if( arr[i][j]== -1)
            {
                arr[i][j]= 0;
            }
        }
     }

 for( int i=0; i< 4; i++)
     {
        for(int j=0; j< 4;j++)
        {
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
     }



    }
}
import java.util.Scanner;
class prgrm2{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[][]=new int[10][10];
        int m,n,i,j ;
        System.out.println(" enter the number of rows and colmns");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println(" enter the "+(m*n)+" elements");

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(" the matrix elements are :");
      for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("  "+ arr[i][j]);
            }
                    System.out.println("");

        }

        int ele;
        System.out.println(" enter the searching element ");
        ele= sc.nextInt();
 for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
             if(ele== arr[i][j])
             {
                System.out.println(" "+(i+1)+","+(j+1));
             }
            }
        }


    }
}
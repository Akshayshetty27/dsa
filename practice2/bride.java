import java.util.Scanner;
class bride
{
    public static void main(String args[])
    {
        int num,qual,positive=0,person;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter number of brides and number of  qualities");
        num=sc.nextInt();
        qual=sc.nextInt();
        int arr[][]=new int[num][qual];
        System.out.println(" findout the person with more qualities ");
        for(int i=0; i <num ;i++)
        {
            int q=0;
            for( int j=0 ;j< qual; j++)
            {
              if(arr[i][j] == 1)
               {
                q++;
               }
            }
            if(q> positive)
            {
                positive=q;
                person= i+1;
            }
        }


        System.out.println(" the bride"+person+ " with "+positive+" qualities");
    }
}
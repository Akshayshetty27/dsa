import java.util.Scanner;
class ksum
{
    public static void main (String args [])
    {
        int k;
        int arr[]={3,8,5,1,9,6,4};
        System.out.println(" enter the value of k ");
        Scanner sc= new Scanner(System.in);
        k= sc.nextInt();
        int sum=0;
        int maxsum=0;
        for(int i=0; i<arr.length - k ;i++)
        {
         for(int j=i;j<i+ k;j++)
{            sum += arr[j];
         }

         if(sum > maxsum)
         {
            maxsum=sum;           
                 }
         sum=0;
        }
        System.out.println(" "+maxsum);
    }
}
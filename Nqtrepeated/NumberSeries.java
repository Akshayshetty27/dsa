import java.util.Scanner;
class NUmberSeriws
{
    public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int [n];
        System.out.println(" enter elements ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
        System.out.println(" un sorted initial array..");
         for( int i=0;i<n;i++)
    {
        System.out.println(" "+arr[i]);
    }
    int count=0;
    int first=0;
    int last=n-1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    System.out.println(" the number in the reqired form  ");
  while(count <n)
  {
    if( count % 2 ==0 )
    {
        System.out.print(" "+arr[last]);
        last--;
        count++;
    }else
    {
        System.out.print(" "+arr[first
        ]);
        first++;
        count++;
    }
  }





}
}
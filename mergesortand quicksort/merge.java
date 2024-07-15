import java.util.Scanner;
class merge{
    public static void conquer(int arr[],int start,int mid ,int end)
    {
        int merger[]=new int[end-start +1];
        int index1=start;
        int index2=mid+1;
        int x=0;
        while(index1<=mid && index2<=end)
        {
            if(arr[index1]<=arr[index2])
            {
                merger[x++]=arr[index1++];
            }
            else{
                merger[x++]=arr[index2++];
            }
            while(index1<=mid)
            {
                merger[x++]=arr[index1++];
            }
            while(index2<=end)
            {
                merger[x++]=arr[index2++];

            }
             System.out.println(" sorting");
            for(int i=0;i<merger.length;i++)
            {
                arr[i]=merger[i];
                 System.out.println(" "+arr[i]);
            }
           
        }    }
    public static void mergesort(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
int  mid=(start+end)/2 ;
mergesort(arr,start,mid);
mergesort(arr,mid+1,end);
conquer(arr,start,mid,end);
    }
    
    public static void main (String args[]){
        int n;
        Scanner sc= new Scanner (System.in);
        System.out.println(" enter the number of elements ");
        n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.println(" enter the elements for array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
    }
}
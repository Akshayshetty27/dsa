

class selectionsort
{
    public static void main(String args[])
    {
         
        int arr[]={3,5,6,7,8,2};
        int min;

        for(int i=0;i<arr.length;i++)
       {     for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                { 
                    min=arr[j];
                    arr[j]=arr[i]; 
                    arr[i]=min;
                     
                }

            }
          
         
        }

System.out.println("\nsorted array is ");
for(int i=0;i<arr.length;i++)
     System.out.print(" "+arr[i]);


    }
}
class leader
{
    public static void main(String args[])
{
    int arr[]={4,5,7,2,3,1};
    boolean leader=true;
    for(int i=0; i< arr.length;i++)
    {
        leader=true;
        for( int j=i+1; j<arr.length;j++)
        {

                if( arr[j]> arr[i])
                {
                leader= false;
                break;
                }    
        }
        if( leader== true)
        {
            System.out.println(" "+arr[i]);
        }
    }
System.out.println(" other approach optimal ");

// optimal solution
int max= arr[arr.length -1];
System.out.println(" "+max);
for( int i=arr.length -1 ; i>0 ; i--)
{
    if(arr[i] > max)
    {
        max=arr[i];
System.out.println(" "+max);
    }
}
}
}
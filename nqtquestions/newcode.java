class newcode{
    public static void main(String args[])
{

int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};

int max=0;
int sum=0;

for( int i=0;i<arr.length;i++)
{
    sum+= arr[i];
    if(sum < 0 )
    {
        sum=0;
    }
    max= Math.max(sum , max);
}


System.out.println(" "+max);


}
}
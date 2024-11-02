class maxsum{

    public static void main(String args[])
{
// kadanes algorithem is used to find maxisum sum .

int arr[]= {-2,-3,4,-1,-2,1,5,-3};
int max=arr[0];
int sum=0;
for ( int i=0; i< arr.length ; i++)
{
    sum+= arr[i];
    if( sum > max )
        max= sum;
    else if(sum < 0 )
     sum =0;
}

System.out.println(" "+max);
}
}
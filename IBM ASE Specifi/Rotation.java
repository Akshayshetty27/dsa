class Rotation
{
    public static void main(String args[])
    {
        int arr[]= { 1,2,3,4,5,};
        int a[] = new int[arr.length];
        int d=3;

        for( int i=0; i< arr.length ;i++)
        {
            a[i] = arr[ (i + d) % arr.length];
        }

        for( int i=0; i< arr.length ; i++)
        System.out.println(" "+ arr[i] +" "+ a[i]);
        }
}
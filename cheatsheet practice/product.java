class product
{
    public static void main(String args[])
{

    int arr[]={3,-1,2,4,2};
    // int product=60;
    int max=0;
    int pref=1,suff=1;
    for(int i=0; i<arr.length;i++)
    {
    pref= pref*arr[i];
    if(pref==0)
     pref=1;
    max= Math.max( max , pref);
    
    suff= suff *arr[arr.length -i -1];
    if( suff ==0 )
     suff=1;
    max= Math.max(max, suff);
    }
System.out.println(" "+max);
}
}
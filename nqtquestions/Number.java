
class Number{

     public static void main(String args[])
    {
int arr[]={ 4,5,6,7,9,11};
int newarr[]= new int[arr.length];
int max =arr.length -1;
int min= 0;
for( int i=0; i< arr.length ;i++)
{
    if(i % 2 == 0 )
    {
        newarr[i] = arr[ max ];
        max-- ;
    }else
    {
        newarr[i ] = arr[min];
        min++;
    }
}

for( int i : newarr){
    System.out.println(i);
}

    }
}
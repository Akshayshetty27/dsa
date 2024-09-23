import java.util.Scanner;

    class mergesort{

        public static void divide(int arr[],int si ,int ei)
{
    if(si >=ei )
    {
        return;
    }
    int mid= si +(ei- si)/2 ;

    divide(arr,si,mid);
    divide(mid+1,ei);
    conqure(arr,si,mid,ei);
    
    }

 public static void conqure(int arr[],int si,int mid ,int ei )
 {
    int merged[]=new int[ei-si+1];
    int index1=si;
    int index2=ei;
    int x=0;
    while(index1<= mid && index2<=ei)
    {
        if(arr[index1] <= arr[index2])
        {
            merged[x]=arr[index1];
            x++;
            index1++;
        }
        else{
            merged[x]=arr[index2];
            x++;
            index2++;
        }
    }

while(index1<=mid)
{
merged[x++]=arr[index1++];
}

while(index2<=mid)
{
    merged[x++]=arr[index2++];

}

for(int i=0,j=si;i<merged.length;i++,j++)
{
    arr[j]=merged[i];
}
 }


    public static void main(String args[])
    {
     Scanner sc= new Scanner(System.in);
     int arr[]= new int[10];
     for(int i=0;i<7;i++)
      arr[i]=sc.nextInt();
    System.out.println(" sorting");
    divide(arr,0,6);
    // 
    for(int j=0;j<7;j++)
    {
        System.out.println(" "+arr[j]);
    }

    }
}
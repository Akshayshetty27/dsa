class Player
{
public static void main(String args[])
{
   int arr[]={1,100,300,600,400,500};  
   int first=0,sec=0;      
for(int i=0;i<arr.length;i++)
{
    if(i%2== 0)
    {
        first+=arr[i];
    }
    else
    {
        sec+=arr[i];
    }
}

System.out.println(" first :"+first+"\nsecond: "+sec+"\n"+Math.abs(sec-first));

    }
}
import java.util.*;
class PosNeg
{
    public static void main (String args[])
    {
     int arr[]={3,1,-2,-5,2,4};
     int ans[]=new int[arr.length];
    int count=0;
    int pos=0;
    int neg=1;
    int i=0;
    while (count < arr.length)
    {
        if(arr[i] > 0 )
        {
            ans[pos]=arr[i];
            if( pos<  arr.length-3)
            {
            pos=pos+2;
            }
            count+=1;
            
        }
        else{
            ans[neg]=arr[i];
             count+=1;
             if(neg < arr.length -2 )
            neg=neg+2;
        }
          i++;
    }

for (int j : ans )
 System.out.println(" "+j);
    }
}
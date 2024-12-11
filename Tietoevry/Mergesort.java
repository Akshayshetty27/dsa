import java.util.*;

public class Mergesort
{


public static void main(String[] args) {

Scanner in=new Scanner(System.in);
String a[]={"Abcdegfg","Whayts","kjaksdk","bdskjsahd" };
sort(a, 0, a.length - 1);
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");
}


public static void sort(String a[],int l, int r)
{
   if(l<r){
       int m=(l+r)/2;
       sort(a,l,m-1);
       sort(a,m+1,r);
       merge(a,l,m,r);
   }
   
}
public static void merge(String a[],int l, int m, int r)
{
   int n1=m-l+1;
   int n2=r-m;
   String left[]=new String[n1];
   String right[]=new String[n2];
   for (int i = 0; i < n1;i++)
            left[i] = a[l + i];
        for (int j = 0; j < n2;j++)
            right[j] = a[m + 1 + j];
           
        int i=0;
        int j=0;
        int k= l;
        while (i < n1 && j < n2) {
            if (isSmaller(left[i],right[j]))
            {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
   
}
public static boolean isSmaller(String a, String b)
{
   a=a.toUpperCase();
   b=b.toUpperCase();
   if(a.compareTo(b)<0)
   return true;
   return false;
}
}
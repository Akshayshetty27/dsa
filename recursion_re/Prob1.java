class Prob1
{
 static void printnum(int n)
 {
     if(n== 5)
      return;
      
     System.out.println(" "+(n+1));
     printnum(n+1);
 }

 static int binsearch(int i, int ele , int arr[])
 {
   
   if( arr[i]== ele)
    return i+1;
   else if( i == arr.length)
      return -1;
  return binsearch(i+1 , ele ,arr);
 }

 static int fibo(int n)
 {
    if(n< 2)
    {
        return n;
    }
    return fibo(n-1)+fibo(n-2);
 }
    public static void main(String args[])
    {
     
printnum(0);
System.out.println(" fibanacci series "+fibo(4));
int arr[]={ 5,4,3,2,1};
System.out.println(" the position is   :"+binsearch(0 ,32,arr));
    }
}
import java.util.Scanner;
class diff{
    public static int findele(int arr[],int ele,int m,int n)
    {
        int i,j=0;
        for(i=0;i<n;i++)
        {
           while(j<m)
           { 
            if(arr[i]<ele)
            {  
                 j++;
            }
           }
           m=i;
           while(m<n)
           {
            if(arr[m]>ele)
            {
                m++;
            }
            if(m==n){
                return i;
            }
        
           }
          
           }
             return -1;
           }
    public static void  main(String[] args) {
     int i,n;
    //  char f}lag='Y';
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the nmber of elments in the array \n");
     n= sc.nextInt();
     System.out.println("enter the elements of the array \n");
     int a[] = new int[n];
     for(i=0;i<n;i++)
     {
        a[i]=sc.nextInt();
     }
     
     for(i=0;i<n;i++)
     {
        System.out.println(findele(a,a[i],i,n));
     }
}
}
        
     

    

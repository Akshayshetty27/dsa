class Stringreplace
{
     public static void main(String args[])
{
    
    String str="language";
    int n= str.length();
    char arr[]=new char[n];
    for(int i=0;i<n;i++)
    {
     arr[i]=str.charAt(i);
    }
for(char ch :arr)
    System.out.print(ch);


    String newstr="";
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]<arr[j+1])
            {
                char temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println("\nsorted");
    for(char ch :arr)
    System.out.print(ch);


    int count=0;
    for(int i=0;i<n;i++)
    {
     if(arr[i]=='a'||arr[i]=='e'|| arr[i]=='i'||arr[i]=='o'|| arr[i]=='u')
     {
          count++;
          newstr+= count;
     }else{
          newstr+=arr[i];
     }
    }

    System.out.println(" the replaced string "+newstr);
}

}
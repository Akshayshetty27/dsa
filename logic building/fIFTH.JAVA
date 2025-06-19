// pattern 
// n = 4;
// 1 2 3 4 
// 5 6 7 
// 8 9
// 10 

import java.util.Scanner;
class fIFTH
{
    public static void main(String args[])
    {
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int count =1;
  for( int i =n ; i> 0; i--)
  {
    for( int j =0 ; j< i ; j++)
    {
        System.out.print(" "+(count++));
    }
    System.out.println("");
  }
    }
}
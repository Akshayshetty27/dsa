//  string : "programming"
//  int n = 3;
//  output :  
//  p   r   i
//  r g a m n
//  o   m   g

class Fourth
{
    public static void main(String args[])
    {
        String str ="programming";
        int n =3;

        int k = (int) Math.ceil((double) str.length() / n);
        System.out.println(str.length()+" k:"+k);
        int counter=0;
        for( int  i = 0 ; i< k ; i++)
        {
            for( int j= 0 ; j< n ; j++)
            {
                   if( i == j  || i < j )
                   {
                    System.out.print(str.charAt(counter++)+" ");
                   }else{
                    System.out.print(" ");
                   }
            }
            System.out.println();
        }

    }

}


import java.util.HashSet;
class subset 
{
    public static void main(String args[])
{
HashSet<Integer> set= new HashSet<>();
HashSet<Integer> set1= new HashSet<>();
set.add(3);
// set.add(6);
set.add(7);
set.add(8);
set1.add(7);
set1.add(3);
set1.add(6);
HashSet<Integer> sub_set= new HashSet<>();
for( int i : set)
{
    for( int j : set1)
     
     {
        if(i==j)
        {
            sub_set.add(i);
        }
     }
}
int subsetcount=0;
System.out.println(" the common elements in the two subsets "+set+" "+set1+ " is "+sub_set);

for( int i : sub_set)
 System.out.print(i+" ");

 // to check whether set1 is a subset of set 
 for( int i : set)
{
    for( int j : set1)
     
     {
        if(j == i)
        {
            sub_set.add(i);
            subsetcount+=1;
        }
     }
}

int sub1count=0;
for(int i: set1)
 sub1count+=1;

if( sub1count == subsetcount)
{
    System.out.println("the set 1 is  subset of set "+sub1count+" "+subsetcount);
}
else
  System.out.println("the set 1 is not subset of set "+sub1count+" "+subsetcount);
}
}
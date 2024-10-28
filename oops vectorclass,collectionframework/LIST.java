import java.util.*;
class LIST{

    static private int[] data ;
    private static int DEFAULT_SIZE= 10;
    private static int size= 0;
    public LIST()
    {
        this.data= new int[DEFAULT_SIZE];
    }

    static void add(int val)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=val;
    }
    private static boolean isFull(){
        return size== data.length;
    }
    public static int get( int index)
    {
        if( index >= size)
        return -1;

        int value= data[index];
        return value;
    }

    public static int Size()
    {
        return size;
    }

public static void  set(int index, int value )
{
 if(index >= size )
 {
    return;
 }
  data[index]= value;
}
    public static int remove()
    {
        int removed= data[--size];
        // size is also working as a index value 
        return removed;
    }

    
    private static void resize()
    {
        int [] temp= new int[data.length * 2];
        // copy the current item in data  into new temparory array ;
        for( int i=0; i< data.length ;i++)
        {
            temp[i]= data[i];
        }
        data=temp;
    }
    public static void main( String args[])
    {
        // ArrayList method 
         // 1.  add(value ) ,  2. get()  3. set( index , value); 4. isEmpty()
    //   List<Integer> list= new ArrayList<>();
    LIST list= new LIST();
      list.add(5);
      list.add(2);
      list.add(9);
      list.set(2,6);
      list.add(9);
//  list.add(4,7);
       System.out.println(list);
    }
}
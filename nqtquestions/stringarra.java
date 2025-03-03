// class stringarra
// {
//     public static int[] stringtoarr(String str)
//     {
//         String arr[]= str.split("[,;//s]+"); 


//          int arr1[] = new int[arr.length];

//          for(int i=0 ; i< arr.length ;i++)
//          {
//             arr1[i] = Integer.parseInt(arr[i]);
//          }

//          return arr1;
//     }
//     public static void main(String args[])
//     {
//          String str = "12,23  24,7,3";

//          int arr[] = stringtoarr(str);
//          System.out.println(arr);

//          for( int i : arr)
//          {
//             System.out.println(" "+i);
//                      }
//     }
// }

import java.util.Arrays; // Import Arrays for printing

class stringarra {
    public static int[] stringToArr(String str) {
        // Corrected regex to split by comma, semicolon, or spaces
        String arr[] = str.split("[,;\\s]+");

        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        return arr1;
    }

    public static void main(String args[]) {
        String str = "12,23  24;7,3"; // Example input

        int arr[] = stringToArr(str);

        // Corrected way to print array
        System.out.println("Converted Integer Array: " + Arrays.toString(arr));

        // Print array elements individually
        for (int i : arr) {
            System.out.println(" " + i);
        }
    }
}

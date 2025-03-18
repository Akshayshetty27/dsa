class MergeSort 
{
    public static void mergersort(int arr[] , int left , int right)
    {
        if( left < right)
        {
            int mid= left + (right - left) / 2;  

            mergersort(arr , left , mid );
            mergersort(arr , mid +1 , right );

            merge(arr , left , mid , right );
            
        }
    }
    public static void merge(int arr[], int left ,int mid , int right )
    {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Create temp arrays
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        // Copy data to temp arrays
        for (int i = 0; i < leftSize; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < rightSize; j++)
            rightArr[j] = arr[mid + 1 + j];

        // Merge temp arrays back into original array
        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from leftArr, if any
        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements from rightArr, if any
        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
    }

    }
    public static void main(String args[])
    {
        int arr[] = { 4,5,3,7,1,2,9,7};
        int left= 0; 
        int right = arr.length - 1;
        mergersort(arr , left , right);

        for( int i : arr)
         System.out.println(i);
        


    }
}

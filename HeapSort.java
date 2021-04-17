public class HeapSort 
{ 
    public void sort_arr(int arr[]) 
    { 
        int n = arr.length; 
        for (int i_arr = n / 2 - 1; i_arr >= 0; i_arr--) 
            heapify_arr(arr, n, i_arr); 
        for (int i_arr=n-1; i_arr>=0; i_arr--) 
        { 
            int temp = arr[0]; 
            arr[0] = arr[i_arr]; 
            arr[i_arr] = temp; 
            heapify_arr(arr, i_arr, 0); 
        } 
    } 
    void heapify_arr(int arr[], int n, int i) 
    { 
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            heapify_arr(arr, n, largest); 
        } 
    } 
    static void printArray_arr(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 56,8,32,1,10}; 
        int n = arr.length; 
          HeapSort ob = new HeapSort(); 
        ob.sort_arr(arr); 
          System.out.println("Sorted array is"); 
        printArray_arr(arr);
    } 
}


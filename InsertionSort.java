import java.util.Scanner;
class InsertionSort { 
    void sort(int arr[])  { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    static void printArray(int arr[])  { 
        int n = arr.length;
        System.out.print("Now the Array after Sorting is :\n"); 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);    
       System.out.print("Enter Array Size : ");  
       int size_arr= scan.nextInt(); 
       int arr[] = new int[size_arr]; 
       System.out.print("Enter Array Elements : ");  
       for(int i=0; i<size_arr; i++){  
           arr[i] = scan.nextInt();  
       } 
        System.out.print("Array are :\n"); 
        for (int i = 0; i < arr.length; ++i){ 
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        InsertionSort ob_arr = new InsertionSort(); 
        ob_arr.sort(arr); 
        printArray(arr); 
        System.out.println("MiLan,B,10");
    } 
}

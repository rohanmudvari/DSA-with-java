import java.util.Scanner;

class BubbleSort{ 
    
    void bubbleSort(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
    
    void optimisedBubbleSort(int arr[]){
        boolean notSorted = false;
        
        do{
            notSorted = false;
            
            for(int i=0;i<n;i++){
                if (arr[i] > arr[i+1]) 
                { 
                    int temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp;
                    notSorted = true;
                }
            }
            
        }while(notSorted);
    }
    
    void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
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
        
        BubbleSort ob_arr = new BubbleSort();
        
        System.out.print("Array are :\n"); 
        for (int i = 0; i < size_arr; ++i){ 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        ob_arr.bubbleSort(arr);
        
        System.out.println("Sorted array"); 
        ob_arr.printArray(arr); 
    } 
}

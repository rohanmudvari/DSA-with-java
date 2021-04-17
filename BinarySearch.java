import java.util.Scanner;
class BinarySearch{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid_arr= (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid_arr] < key ){  
        first = mid_arr + 1;     
      }else if ( arr[mid_arr] == key ){  
        System.out.println("Element is found at location: " + (mid_arr+1));  
        break;  
      }else{  
         last = mid_arr - 1;  
      }  
      mid_arr = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        Scanner sc_arr=new Scanner(System.in);
        System.out.println("Enter size of data:");
        int n=sc_arr.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc_arr.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc_arr.nextInt();    
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
}  

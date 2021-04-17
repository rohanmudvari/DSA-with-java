import java.util.Scanner;  
public class LinearSearchDemo   {  
  public static void main(String args[])  {  
    int i, n, search, array[];  
    Scanner sc= new Scanner(System.in);  
    System.out.print("Enter size of elements: ");  
    n = sc.nextInt();   
    array = new int[n];    
    System.out.println("Enter " + n + " elements");     
    for (i = 0; i < n; i++){  
      array[i] = sc.nextInt();
    }
    System.out.print("Enter value to find: ");  
    search = sc.nextInt();    
    for (i = 0; i < n; i++)     {  
      if (array[i] == search)     {  
         System.out.println(search + " is present at location " + (i + 1) + ".");  
          break;  
      }  
   }  
   if (i == n){
      System.out.println(search + " isn't present in array.");  
   }
  }  
}

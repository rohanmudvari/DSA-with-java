import java.util.*; 
  public class Hash_Table_Demo { 
    public static void main(String[] args) 
    { 
        Hashtable<Integer, String> hash_table =  
        new Hashtable<Integer, String>(); 
        hash_table.put(10, "Rohan"); 
        hash_table.put(15, "4"); 
        hash_table.put(20, "Mudvari"); 
        hash_table.put(25, "Loves"); 
        hash_table.put(30, "You"); 
        System.out.println("Initial Table is: " + hash_table); 
        String returned_value = (String)hash_table.remove(20); 
        System.out.println("Returned value is: " + returned_value); 
        System.out.println("New table is: " + hash_table); 
    } 
}

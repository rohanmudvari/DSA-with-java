//insertion
import java.util.Scanner;
public class DLL { 
    Node head;
    class Node { 
        int data; 
        Node prev; 
        Node next; 
        Node(int d) { data = d; } 
    } 
    public void push(int new_data)  { 
        Node new_Node = new Node(new_data); 
        new_Node.next = head; 
        new_Node.prev = null; 
        if (head != null) 
            head.prev = new_Node; 
        head = new_Node; 
    } 
    public void InsertAfter(Node prev_Node, int new_data)  { 
        if (prev_Node == null) { 
            System.out.println("The given previous node cannot be NULL "); 
            return; 
        } 
        Node new_node = new Node(new_data); 
        new_node.next = prev_Node.next; 
        prev_Node.next = new_node; 
        new_node.prev = prev_Node; 
        if (new_node.next != null) 
            new_node.next.prev = new_node; 
    } 
    void append(int new_data) { 
        Node new_node = new Node(new_data);  
        Node last = head; 
        new_node.next = null; 
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        new_node.prev = last; 
    } 
    public void printlist(Node node)  { 
        Node last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.println(node.data ); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.println(last.data + " "); 
            last = last.prev; 
        } 
    } 
    public static void main(String[] args)   { 
        Scanner sc=new Scanner(System.in);
        DLL dll = new DLL(); 
        System.out.print("Enter the size of data you want to add at beginning:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            dll.push(sc.nextInt());
        }
        System.out.print("\nEnter the size of data you want to add at end:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            dll.append(sc.nextInt());
        } 
        dll.InsertAfter(dll.head.next, 23); 
        System.out.println("Created DLL is: "); 
        dll.printlist(dll.head); 
    } 
}
//deletion
import java.util.Scanner;
public class DLLDeletion {  
    class Node{  
        int data;  
        Node previous;  
        Node next;   
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  public int size = 0;   
    Node head, tail = null;    
    public void addNode(int data) {  
        Node newNode = new Node(data); 
        if(head == null) {    
            head = tail = newNode;    
            head.previous = null;   
            tail.next = null;  
        }  
        else {   
            tail.next = newNode;   
            newNode.previous = tail;  
            tail = newNode;   
            tail.next = null;  
        }   
        size++;  
    }  
    public void deleteFromStart() {  
        if(head == null) {  
            return;  
        }  
        else {   
            if(head != tail) {   
                head = head.next;   
                head.previous = null;  
            }    
            else {  
                head = tail = null;  
            }  
        }  
    }   
    public void deleteFromEnd() {  
        if(head == null) {  
            return;  
        }  
        else {  
            if(head != tail) {  
                tail = tail.previous;  
                tail.next = null;  
            }   
            else {  
                head = tail = null;  
            }  
        }  
    } 
    public void deleteNodeAtPostion(int position){ 
        if(head == null) {  
            return;  
        }  
        else {              
            Node current = head;    
            for(int i = 0; i < position; i++){  
                current = current.next;  
            }            
            if(current == head) {  
                head = current.next;  
            }               
            else if(current == tail) {  
                tail = tail.previous;  
            }  
            else {  
                current.previous.next = current.next;  
                current.next.previous= current.previous;  
            }  
             current = null;  
        }  
        size--;  
    }   
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }   
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        DLLDeletion dList = new DLLDeletion();
        System.out.print("Enter the size of Link list:");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
             dList.addNode(sc.nextInt());
        }
        System.out.println("Original List: ");  
        dList.display();  
        dList.deleteFromStart();   
        System.out.println("Updated List after deletion from start: ");  
        dList.display();  
        dList.deleteFromEnd();   
        System.out.println("Updated List after deletion from end: ");  
        dList.display();
        System.out.print("Enter the postion from where you want to delete:");
        int n=sc.nextInt();
        dList.deleteNodeAtPostion(n);   
        System.out.println("Updated List after deletion at postion "+n+": ");  
        dList.display(); 
        }  
    }  

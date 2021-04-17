import java.util.Scanner;
public class CircularQueue{
    public static void main(String args[]){
        Queue1 obj = new Queue1();
        int i;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Menu\n1.insert\t2.delete\t3.display\t4.destroy\t5.exit");
            System.out.print("Enter choice :");
            i=sc.nextInt();
            switch(i){
                case 1:
                    System.out.print("Enter data to insert:");
                    int mk=sc.nextInt();
                    obj.insert(mk);
                break;
                case 2:
                    if(obj.empty())
                    System.out.println("Queue underflow");
                    else{
                        int km =obj.delete();
                        System.out.println("data deleted =" + km );
                    }
                break;
                case 3: obj.display();
                break;
                case 4: obj.destroy();
                break;
                case 5: break;
                default : System.out.println("Wrong Choice");
            }
        }while(i!=5);
    }
}
class Queue1{
    int mk[];
    int front, rear;
    Queue1(){
        mk = new int [100];
        front = rear = 1;
    }
    Queue1(int size){
        mk = new int[size];
        front = rear = -1;
    }
    void insert(int x){
        int mi;
        mi = (rear+1)% mk.length;
        if(mi == front)
            System.out.println("Queue Overflow ");
        else
        {
            rear = mi;
            mk[rear] = x;
            if(front == -1)
               front = 0;
        }
    }
    boolean empty()
    {
        if(front == -1)
            return true;
        else
            return false;
    }
    int delete(){
        int kar = mk[front];
        if(front == rear)
            front = rear = -1;
        else
            front =(front+1)% mk.length;
        return kar;
    }
    void display(){
        if(front == -1)
           System.out.println("Queue underflow");
        else{
            System.out.println("Elements of Queue are");
            int i = front;
            while(i != rear)
            {
                System.out.println(mk[i]);
                i = (i+1)% mk.length;
            }
            System.out.println(mk[i]);
        }
    }
    void destroy(){
        front = rear=-1;
    }
}


import java.util.Scanner;
class  Fibonacci{
    int fibo(int n){
        int result;
        if(n<=1){
            return n;
        }
        else{
        return(fibo(n-1)+fibo(n-2));
        }
    } 
}
class FibonacciDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Fibonacci f=new Fibonacci();
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci series for "+n+" elements: ");
        for(int i=1;i<=n;i++){
            System.out.println(f.fibo(i));
        }
    }
}

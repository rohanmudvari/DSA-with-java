import java.util.Scanner;
class Factorial {
    int fact(int n, int result){
        if(n==1){
            return result;
        }
        else{
        return(fact(n-1,n*result));
    }
}
}
class FactorialDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Factorial f=new Factorial();
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+f.fact(n,1));
    }
}

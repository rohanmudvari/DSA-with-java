import java.util.Scanner;
class LinearHash{
public int arr[];
public LinearHash(){
arr = new int[0];
}
public LinearHash(int len){
int p = nextPrime(len);
arr = new int[p];
}
public void initialize(){
for(int i=0;i<arr.length;i++){
arr[i]=-1;
}
}
public void insertMidSQ(int num){
int mid = midSquare(num);
int N = arr.length;
int i = mid%N;
int j = i+1;
if(arr[i]==-1)
arr[i] = num;
else{
while(j!=i){
j = (j+1)%N;
if(arr[j]==-1){
arr[j] = num;
break;
}
}
}
}
public void insertExtract(int num){
int s = extract(num);
int N = arr.length;
int i = s%N;
int j = i+1;
if(arr[i]==-1)
arr[i] = num;
else{
11
while(j!=i){
j = (j+1)%N;
if(arr[j]==-1){
arr[j] = num;
break;
}
}
}
}
public int extract(int n){
int s = 0;
while(n>0)
{
s = s+n%10;
n = n/10;
}
return s;
}
public int midSquare(int n){
int s = n*n;
int mid = s/100;
mid = mid/10;
return mid;
}
public void insertDiv(int num){
int N = arr.length;
int i = num%N;
int j = i;
if(arr[i]==-1)
arr[i] = num;
else{
do{
j = (j+1)%N;
if(arr[j]==-1){
arr[j] = num;
break;
}
}while(j!=i);
}
}
public void delete(int num){
12
int N = arr.length;
int i= num%N;
int j = i;
int t = i;
if(arr[i]==num)
arr[i]=-1;
do{
j = (j+1)%N;
if(arr[j]%N==t){
arr[t] = arr[j];
arr[j]=-1;
t = (t+1)%N;
}
}while(j!=i);
}
public boolean Search(int num){
boolean b = false;
int N = arr.length;
int i = num%N;
int j = i;
if(arr[i]==num)
b = true;
else{
do{
j = (j+1)%N;
if(arr[j]==num){
b = true;
break;
}
}while(j!=i);
}
return b;
}
public void display(){
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
public int nextPrime(int n){
int t=0,p=0;
for(int i=n;t!=1;i++)
{
t = isPrime(i);
if(t==1)
{
p = i;
break;
}
}
return p;
}
public int isPrime(int n){
int i,j,t=0,b=0;
for(j=1;j<=n;j++)
{
if(n%j==0)
t++;
if(t>2)
break;
}
if(t==2)
b =1;
return b;
}
}
public class HashingDemo {
public static void main(String[] args) {
int data[]={13,14,1,2,9,28};
LinearHash h = new LinearHash(data.length);
h.initialize();
int n;
for(int i=0;i<data.length;i++)
{
h.insertDiv(data[i]);
}
System.out.println("The array is ");
h.display();
Scanner s = new Scanner(System.in);
System.out.println("\nEnter number to be searched");
n = s.nextInt();
if(h.Search(n))
System.out.println("Number found");
else
System.out.println("Number not found");
System.out.println("\nEnter number to delete");
n = s.nextInt();
h.delete(n);
System.out.println("The hash table after deletion");
h.display();
}
}

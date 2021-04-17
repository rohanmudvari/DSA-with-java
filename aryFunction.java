class aryFunction{
	static void min(int arr[]){
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if (min>arr[i]){
				 min=arr[i];
				 }	
		}
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
				int a[]={12,25,64,23,78,40};
				min(a);
			}
}
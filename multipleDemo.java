class multipleDemo{
	static int multiple(int num){
		int i=1;
		if (num==0) {
			return 1;
		}
		else{
			return(num*multiple(num-1));
		}
	}
	public static void main(String[]args){
		System.out.println(multiple(4));
	}
}
class Prime{
	public static void main(String []args){
		int a=3;
		int flag=0;
		if(a==0 && a==1){
			System.out.println(a+"is Neither prime nor Composite Number");
		}
		for(int i=2;i<=a;i++){	
			if(a%i==0){
				flag++;
				break;
			}
				
		}
		if(flag==0){
			System.out.println(a+"is prime");
		}
		else{
			System.out.println(a+"is not prime");
		}

	}
}
class Fibono{

	void UserMeth(){
		int a =0;
		int b=1;
		int sum=0;
		System.out.print(a+" "+b);
		for(int i=0;i<20;i++){
			if(sum<13){
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(" "+sum);
			}
			else
			break;

			
		}
	}
	public static void main (String[] args){
		Fibono fb = new Fibono();
		fb.UserMeth();
	}
}
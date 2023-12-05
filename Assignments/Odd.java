class Odd{
	

	void UserEven(){
		for(int i=1;i<=30;i++){
			if(i%2==0){
				System.out.println(i+ " is a Even Number");
			}
			else{
				System.out.println(i+" is a Odd Number");
			}
		}
	}
	public static void main(String[] args){
		Odd od = new Odd();
		od.UserEven();
	}
}
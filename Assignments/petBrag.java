class pet{
	void Brag(){
		System.out.println("I have the best Pet");
	}
}
class dog extends pet{
	void Brag(){
	super.Brag();
	System.out.println("I have the best dog");
	}
	public static void main(String []args){	
		dog d = new dog();
		d.Brag();
	}
	
}
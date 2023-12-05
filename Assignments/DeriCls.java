class BaseCls{
	void Greet(){
		System.out.println("Hello");
	}
	void Greet(String name){
		System.out.println("Hello " + name);
}
	public static void main(String []args){
		BaseCls dc = new BaseCls();
		dc.Greet();
		dc.Greet();
		dc.Greet("Sansa");
	}
	
}
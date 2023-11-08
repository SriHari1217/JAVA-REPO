interface A{
	int a=100;
	void Userinfo();
	void UserRun();
	void UserDisp();
	void UserDemo();
	
}
interface B{
	void Userinfo();
	void UserRun();
	void UserDisp();
	void UserDemo();	
}
class InterHerit implements A,B{
	public void UserRun(){}
	public void UserDisp(){}
	public void UserDemo(){}
	public void Userinfo(){
		//b=100;
		System.out.println("From Interface" + a);
	}
	public static void main(String args[]){
		InterHerit ih = new InterHerit();
		ih.Userinfo();
	}
}
abstract class Remote{
	 final int a = 100;
	abstract void userOn();
	void userButtons(){}
}
class TvRemote extends Remote{
	public void userOn(){
		//a=80;
		System.out.println("On TV"+a);
	}
	void buttonSound(){
		System.out.println("Increase or Decrease");
	userOn();
		
	}
	public static void main(String args[]){
		TvRemote tr = new TvRemote();
		tr.buttonSound();
	}
}
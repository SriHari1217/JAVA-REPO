class Candy{
	void Taste(){
		System.out.println("Tastes Sweet");
	}
}
class Chocolate extends Candy{
	void Taste(){
		super.Taste();
		System.out.println("Tastes Chocolately");
	}
	
	public static void main(String[]args){
		Chocolate cs = new Chocolate();
		cs.Taste();
	}
}

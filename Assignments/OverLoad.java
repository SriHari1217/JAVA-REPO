class OverLoad{
	void Talk(){
		System.out.println("Hello");
		
	}
	void Talk(String name){
		System.out.println("Hello "+ name );
	}
	public static void main(String[]args){
		OverLoad ol = new OverLoad();
		ol.Talk();
		ol.Talk("Sri Hari");
			
	}
}
class ThisDemo{
	String name = "Global variable";
	void userMeth(){
		System.out.println("Method");
	}
	void userVar(){	
		String name = "Local variable";
		System.out.println(name);
		System.out.println(this.name);
		userMeth();
	}
	public static void main(String args[]){
		ThisDemo td = new ThisDemo();
		td.userVar();
		
	}

}
class MethOver{
	int UserAdd(){
		int a =20;
		int b=30;
		System.out.println(a+b);
		return 0;
	}
	void UserAdd(int a){
		String name = "Sri";
		System.out.println(name+"Hari");
		UserAdd();
	}
	public static void main(String args[]){
		MethOver mo = new MethOver();
		mo.UserAdd(10);
	}
}
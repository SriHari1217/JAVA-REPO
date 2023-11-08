class Shiftop{
	void UserDisp(){
		int a = -4;
		System.out.println(a<<1);
		System.out.println(a>>>4);
		System.out.println(a>>4);

	}
		public static void main(String args[]){
			Shiftop so = new Shiftop();
			so.UserDisp();
		}
		
}
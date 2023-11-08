class StringDemo{

	void UserDisp(){
		String name = "JAVA";
		String n = "JAVA";
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		String str3 = new String("java");
		System.out.println(name==n);
		System.out.println(str1==str2);	
		System.out.println(str1.equals(str2));	
		System.out.println(str1.equalsIgnoreCase(str3));
		String a = "Sri";
		String b = a.concat(" hari");
		System.out.println(b);
		
	}
	 void UserMeth(){
		int a = 100;
		String s = String.valueOf(a);
		int b = 200;
		System.out.println(b+s);
		String name = "Srihari";
		System.out.println(name.substring(1,5));
		System.out.println(name.indexOf('a'));
		
		
		System.out.println(b+a);
		
	}
	void StrBuff(String str){
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	
	}
	public static void main(String args[]){
		StringDemo sd = new StringDemo();
		//sd.UserDisp();
		//sd.UserMeth();
		String str= "java";
		sd.StrBuff(str);
					
		
	}
}
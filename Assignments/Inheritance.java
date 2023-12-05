class ParentCls{
	void UserDisp(){
		System.out.println("Parent Class");
	}
}
class ChildCls extends ParentCls{
	void UserDisp(){
		System.out.println("Child Class");
	}
	public static void main (String []args){
		ParentCls pc = new ParentCls();
		pc.UserDisp();
		ChildCls cc = new ChildCls();
		cc.UserDisp();
	}
		
}

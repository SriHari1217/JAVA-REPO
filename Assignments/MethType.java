
import java.util.Scanner;
class MethType{
	Scanner sc = new Scanner(System.in);

	int UserModul(int a,int b){
		int modul = a%b;
		return modul;
			
	}
	int UserDiv(int a,int b){
		int div = a/b;
		System.out.print("Enter");
		int c = sc.nextInt();
		System.out.println("modul: "+ UserModul(div,c));	
		return div;
	}
	int UserMul(int a,int b){
		int mul = a*b;	
		System.out.print("Enter");
		int c = sc.nextInt();	
		System.out.println("Div: "+UserDiv(mul,c));
	
		return mul;
			
	}
	int UserAdd(int a,int b){
		int add = a+b;
		System.out.print("Enter");
		int c = sc.nextInt();
		System.out.println("Mul: "+UserMul(add,c));
		return add;
			
	}
	void UserDisp(){
		System.out.print("Enter:");
		int a = sc.nextInt();
		System.out.print("Enter:");
		int b = sc.nextInt();
		System.out.println("Add: "+  UserAdd(a,b));
		

	}
	
	public static void main(String []args){
		MethType mt = new MethType();
		mt.UserDisp();
		
	}
}
import java.util.Scanner;

class StringChar{
	Scanner sc = new Scanner(System.in);
	void UserDisp(){
		String str = sc.nextLine();
		char ch1 ='S';
		char ch2 ='R';
		char ch3 ='I';
		
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i));
		}
		System.out.print(String.valueOf(ch1)+String.valueOf(ch2)+String.valueOf(ch3));
		
		
	}
	public static void main(String [] args){
		StringChar sc = new StringChar();
		sc.UserDisp();
		
	}
}

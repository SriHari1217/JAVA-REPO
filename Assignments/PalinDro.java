import java.util.Scanner;
class PalinDro{
	Scanner sc = new Scanner(System.in);

	void UserDisp(){
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		if(sb.equals(sb.reverse())){	
			System.out.println("It is Palindrome");
		}
		else{
			System.out.println("It is not Palindrome");
		}
			
		
	}


	
	public static void main (String [] args){
		PalinDro pd = new PalinDro();
		pd.UserDisp();
	}
}
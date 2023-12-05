import java.util.Scanner;
class Palindrome{
	Scanner sc = new Scanner(System.in);
		
	void UserMeth(){
		String str = sc.next();
		String rev= "";
		for(int i = str.length()-1;i>=0;i--){		
		rev+=str.charAt(i);	
		}
		if(rev.equals(str)){
			System.out.println("It is Palindrome");
		}
		else
		System.out.println("It is not Palindrome");
			
		
	}
	void UserDisp(){
		String str = sc.next();
		int flag =0;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				System.out.println("It is not Palindrome");
				flag=1;
				break;	
			}	
		}
		if(flag==0){
		 System.out.println("It is Palindrome");
		}
	}
	public static void main(String args[]){
		Palindrome p = new Palindrome();
		//p.UserMeth()
		p.UserDisp();
	}
}
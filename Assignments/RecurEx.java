import java.util.Scanner;


class RecurEx{
	Scanner sc = new Scanner(System.in);
	int product = 1;

	int fact(int a){
		if (a>0){
			
			return a*fact(a-1);
		}
		else{
			return 1;
			
		}
	}

	void  UserMeth(){
		int a = sc.nextInt();
		product = fact(a);
		System.out.println(product);
		
		
		
	}
	public static void main (String [] args){
		RecurEx re = new RecurEx();
		re.UserMeth();
		
	}
	
	
}
package Asssignments;
import java.util.Scanner;
public class Conversion {
	Scanner sc = new Scanner(System.in);
	void Run(){
		System.out.print("Enter your No: ");
		int a = sc.nextInt();
		if(a==0)
			System.out.println(1);
		else {
			int temp=0;
			while(a!=0) {
				int rem = a%10;
				if(rem==0) {
					rem=1;
					}
				else if (rem==1) {
					rem=0;
				}
				
				temp=temp*10+rem;
				a=a/10;
			}
			System.out.println(temp);
			
			int b=0;
			while(temp!=0) {
				
				int sum =temp%10;
				b=b*10+sum;
				temp=temp/10;	
				
			}
			System.out.println(b);
			
			
		}
		
	}
	
	public static void main(String []args){
		Conversion p = new Conversion();
		p.Run();
	}

}

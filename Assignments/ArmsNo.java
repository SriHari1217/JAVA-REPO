import java.util.Scanner;
import java.lang.Math;	
class ArmsNo{
	
	void UserRun(){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int count=0;
		int temp = s;
		int sum=0;
		while(temp!=0){
			temp = temp/10;
			count++;
		}
		temp = s;
		while(temp!=0){	
			int c = temp%10;
			sum+=Math.pow(c,count);
			temp=temp/10;
		}
		if(sum==s){
			System.out.println(s+ " is a Armstrong");
		}
		else
		System.out.println(s+ " is not  a Armstrong");
		
		
		
	}
	public static void main(String args[]){
		ArmsNo an = new ArmsNo();
		an.UserRun();
		
		
	}
}
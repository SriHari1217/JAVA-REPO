import java.util.Scanner;

class ScanDemo{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int a = sc.nextInt();
		System.out.print("Enter the value: ");
		int b = sc.nextInt();

		System.out.print("Enter the String: ");
		String str = sc.next();
		System.out.print("Sum: ");
 		System.out.println(a+b);
                System.out.println(str);
		System.out.println(10*10/5+3-1*4/2);
		System.out.println(++a + a++);
		System.out.println(--b - b--);
		
		
	
		

	}
}
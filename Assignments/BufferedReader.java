import java.io.BufferedReader;
import java.io.InputStreamReader;
class BuffRed{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value: ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("Enter the value: ");
		int b= Integer.parseInt(br.readLine());
		System.out.print("Sum: ");
		System.out.println(a+b);
		
		
	}
}

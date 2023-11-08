import java.io.DataInputStream;
class dataIn{
	public static void main(String args[]) throws Exception
	{
		DataInputStream ds = new DataInputStream(System.in);
		System.out.print("Enter the value: ");
		int a = Integer.parseInt(ds.readLine());
		System.out.print("Enter the value: ");
		int b= Integer.parseInt(ds.readLine());
		System.out.print("Sum: ");
		System.out.println(a+b);
		
		
	}
}

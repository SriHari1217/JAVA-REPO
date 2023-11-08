import java.util.Scanner;

class StringDubl{
	Scanner sc = new Scanner(System.in);
	
	void UserDisp(){
		int count;
		String str = sc.nextLine();
		char[] chars = str.toCharArray();
		for(int i=0;i<chars.length;i++){
			count=1;
			for(int j=i+1;j<chars.length;j++){
				if(chars[i]==chars[j]){
					count++;
					chars[j]='0';
				}
			}
			if(count>1&&chars[i]!='0'){
				System.out.println(chars[i]);
			}
		}

	}
	
	public static void main(String args[]){
		StringDubl sbl=new StringDubl();
		sbl.UserDisp();
	}
}
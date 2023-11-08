import java.util.*;
class StringDub{
	Scanner sc = new Scanner(System.in);
	void UserDisp() {

try{
		String str = sc.nextLine();
		char[] chars = str.toCharArray();
		HashMap<Character,Integer>map=new HashMap();
		
		

		for(int i=0;i<chars.length;i++){
			
			if(map.containsKey(chars[i])){
				map.put(chars[i],map.get(chars[i])+1);
				
			}
			else{
				map.put(chars[i],1);	
			}
		}
		
		for(Map.Entry<Character,Integer>entry:map.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
				
			}	
		}
		
} catch(Exception e){

e.printStackTrace();
}
	}
	public static void main (String []args) {
	StringDub sd = new StringDub();
	sd.UserDisp();
	
	}
}
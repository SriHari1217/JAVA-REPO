class PrimeNo{
	void PrimeDemo(){
		for(int i=0;i<=20;i++){
			if(UserDisp(i)){
				System.out.println(i);	
			}
			//else{
				//System.out.println(i+" is not prime Number");
			//}
		}
	}
	
	 boolean UserDisp(int a){
			if(a<=1)
			
		        return false;
			
			for(int i=2;i<=a/2;i++){
				
				if(a%i==0){
					return false;
					
				}
			}
			return true;	
		        	
	}
	public static void main(String args[]){	
		PrimeNo pn = new PrimeNo();
		pn.PrimeDemo();
	}
}

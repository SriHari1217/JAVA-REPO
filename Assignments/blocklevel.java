class blocklevel{
	void userVar(){
	int a=100;
	{
	   int b=50;
	   System.out.println(a+b);
	}
	  b=90;
	  System.out.println(a);
  }   

public static void main(String[] args){
 	 blocklevel bl = new blocklevel();
	 bl.userVar();
   }	
}
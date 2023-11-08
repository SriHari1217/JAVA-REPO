import java.util.Scanner;

class Atm{
		float avalbal = 100000.0f;
		Scanner sc = new Scanner(System.in);
		boolean fat = true;
		
		

				 void UserDisp(String name,int pass){
				System.out.print("Enter Your Name: ");
				String str1 = sc.nextLine();
				System.out.print("Enter Your Password: ");
				int p =sc.nextInt();
				if(name.equals(str1) && pass==p){
				System.out.println("Welcome to your Account");	
				do{
				System.out.println("Enter the Choice: 1) Withdraw 2) Deposit 3) Checkbook Report");
				int b = sc.nextInt();
				switch(b){
					case 1:
					 WithDraw();
					 break;
					case 2:
					Deposit();
					break;
					case 3:
					CheckRep();
					break;
				}
					
					System.out.print("Do you Wanna Continue: ");
					String str2= sc.next();
					if(str2.equals("no")){	
					fat=false;
					System.out.println("Thank You and Meet you Next time!!");
					break;
					
					}

					
			}while(fat);
				
			}
			else{
				System.out.println("UserName Not Found");
			}
		}




		void WithDraw(){
			System.out.print("Enter your Amount: ");
			int amount= sc.nextInt();
			if(avalbal!=0 && amount<avalbal ){
			avalbal = avalbal-amount;
			System.out.println("The amount is withdrawed");
			System.out.println("The Available Balance is "+
avalbal);
				
			}
			else{
				System.out.println("No Money in your Account");
			}
		}



		void Deposit(){
			System.out.print("Enter your Amount: ");
			int amount= sc.nextInt();
			avalbal = avalbal+amount;
			System.out.println("The Available Balance is "+
avalbal);	
		
		}


		void CheckRep(){
			System.out.println("The Available Balance is "+
avalbal);
			
		}


		
		public static void main(String args[]){
			String name = "srihari";
			int pass = 1234;
			Atm a = new Atm();
			a.UserDisp(name,pass);
	
			

	}
}

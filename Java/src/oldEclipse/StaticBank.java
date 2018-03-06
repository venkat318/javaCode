package oldEclipse;

public class StaticBank {
	
	String accountholdername;
	double balance;
	int accountnumber;
	static String bankname="SBI";                //static variable
	
	public String getAccountholdername() 
	{
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) 
	{
		this.accountholdername = accountholdername;
	}
	public int getAccountnumber() 
	{
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) 
	{
		this.accountnumber = accountnumber;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
public static double FindInterest(StaticBank b){   
	b.balance=(b.balance+b.balance*0.04);
		return b.balance;
	}
public static void main(String args[]){
		StaticBank sb1=new StaticBank();
	
		sb1.setAccountholdername("Rakesh");
		sb1.setAccountnumber(1002);
		sb1.setBalance(4200);
		
		StaticBank sb2=new StaticBank();
		sb2.setAccountholdername("Kishore");
		sb2.setAccountnumber(1004);
		sb2.setBalance(8200);
		double result1=FindInterest(sb1);     
		System.out.println("After Interest calculation:"+result1);
		double result2=FindInterest(sb2);    
		System.out.println("After Interest calculation:"+result2);
		}

}

package CustomerDetails;

public class SbiBank extends IciciBank {
	
	//override to icicibank class
	public void branchNumber() {
			int No= 102;
System.out.println("Branch Number is :"+ No);
	}
		//int No= 002;
	public void branchName() {
		String BankName = "STATE BANK OF INDIA";
		System.out.println("Bank Name is :"+ BankName );
		}
	public void branchName(String name, long manager ) {
		//String Name = "STATE BANK OF INDIA";
		//System.out.println("Area Name is: "+name +"\n"+"Area code is:"+manager);
		///System.out.println( );
		//System.out.println("Area name is : "+ name +"/n"+"branch code is : "+code);
}
	//override to icici class
	public void IntrestRange( ) {
		float Intreast = 9.5F;
			System.out.println("Minimum Intreast value is "+ Intreast);
	}
public static void main(String[] args) {
	SbiBank SBI =new  SbiBank();
	SBI.branchNumber();
	SBI.branchName("T nagar",600015);
	SBI.branchName();
	SBI.customerLocation();
	SBI.accountType();
	SBI.customerName("kumaran" );
	SBI.Loan(65000.35f);
	SBI.IntrestRange();
}

}

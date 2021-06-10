package CustomerDetails;

public class IciciBank extends CustomerInfo  {
	public void branchNumber() {
		// TODO Auto-generated method stub
System.out.println("Branch Number is : 001");
	}
	private void branchName() {
		String BankName = "ICICIBANK";
		System.out.println("Bank Name is :"+ BankName );
		// TODO Auto-generated method stub
	}
	public void accountType( ) {
		String savings = "Student Account";
		// TODO Auto-generated method stub
		System.out.println("This is a : "+ savings);
	}
	public void IntrestRange( ) {
		float Intreast = 12.5F;
		// TODO Auto-generated method stub
		System.out.println("Minimum Intreast value is "+ Intreast);
	}

}

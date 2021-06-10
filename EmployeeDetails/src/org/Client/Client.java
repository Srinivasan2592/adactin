package org.Client;
import org.emp.Company;
import org.emp.Employee;
public class Client {
	private static void clientId() {
		String clientId = "CTS2012";
		System.out.println("my id is "+clientId);
	
	}
public static void main(String[] args) {
	Company k = new Company();
	k.companyId();
	
Employee p = new Employee();
p.empId();

Client cc = new Client();
  cc.clientId();

	
}


}


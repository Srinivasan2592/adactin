package Scanner;


public class Employee {
public void empId(String name) {
	System.out.println("String Method"+name);
}
public void empid(String name,long phno, char block) {
	System.out.println("my name is"+name);
	System.out.println(phno+ "\n" + block);
}
public void empid(int age) {
System.out.println("int method" + age);
}
public void empid(boolean peremp) {
	System.out.println("boolean method"+ peremp);
}
public  void empid(String project,String manager) {
System.out.println("string string"+ project);
System.out.println("manager");
}
public void empid(int email,float sal) {
	System.out.println("string float"+email +sal);
}
public static void main(String[] args) {
	Employee em=new Employee();
em.empId("srini");
em.empid("srini",9043895560l , 's');
em.empid(20);
em.empid(false);
em.empid("database","balan");
em.empid('m',0.20f);

}
}


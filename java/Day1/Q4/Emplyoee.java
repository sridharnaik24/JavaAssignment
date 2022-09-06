package fourthques;

public abstract class Emplyoee {
	int empid;
	String empName;
	//String Adress;
	double basicPay;
	int noOfLeaves;
	
	Emplyoee(int empid, String empName, double basicPay,int noOfLeaves){
		this.empid=empid;
		this.empName=empName;
		this.basicPay=basicPay;
		this.noOfLeaves=noOfLeaves;
	}
	
	public  abstract double calSalary();
}


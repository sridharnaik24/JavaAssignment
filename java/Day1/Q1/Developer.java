package day3_assignment;

public class Developer extends Emplyoee{
	double devSal;
	Developer(int empId,String empName,double empSal){
		super(empId,empName,empSal);
		
	}
	public double devSalary() {
		devSal =empSal*10;
		return devSal ;
	}
	public void  disDev() {
		System.out.println("emplyoo id"+empId+"name"+empName);
		System.out.println("Salary of Devloper"+devSal);
	}
}

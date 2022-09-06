package thirdques;

public class Emplyoee {
 public static void calSal(int empSal) throws MyempException{
	 if(empSal<100000)
		 throw new MyempException("salary should not be lesser than 100000");
	 else
		 System.out.print("Salary "+empSal);
		
 }
	public static void main(String[] args) throws MyempException {
		// TODO Auto-generated method stub
		calSal(2000);
	}

}

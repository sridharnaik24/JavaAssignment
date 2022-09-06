package Assignment;

public class Student {
	String stdName;
	int StdID;
	String stdClass;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s = new Student();
			s.StdID=123;
			s.stdName="sid";
			s.stdClass="%th Sttd";
			System.out.println("Student id\t"+s.StdID+" Student name\t"+s.stdName+"Student class\t "+s.stdClass );
	}

}

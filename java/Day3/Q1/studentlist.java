package assignment4java;
import java.util.LinkedList;
import java.util.List;
public class studentlist {
	public List<student>addStudents(){
		List<student> std= new LinkedList<student>();
		std.add(new student(110,"RAM", 69));
		std.add(new student(111,"SHYAM", 16));
		std.add(new student(112,"YASH", 58));
		std.add(new student(113,"SID, 89));
		return std;
	
	}
}


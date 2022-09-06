package day3_assignment;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester T =new Tester(101,"sid",3000);
		Manager e1 = new Manager(102,"Deepak",333);
		Developer d= new Developer(103,"vaishnavi",2000);
		
		//Manager e =new Manager();
		//e.display();
		e1.Cal();
		e1.dispManger();
		d.devSalary();
		d.disDev();
		T.salCal(1000);
		T.display();
		
		}

}

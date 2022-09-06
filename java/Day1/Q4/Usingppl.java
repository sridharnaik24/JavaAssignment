package fourthques;

public class Usingppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technicalemp t=new Technicalemp(101,"sid",10000,5,"Java");
		Staff s =new Staff(102,"deepak",5000,3);
		Adress a = new Adress(1001,"Bangalore","padmanbhanagar",57232);
		Adress a1 = new Adress(1021,"Bangalore","JPnagar",57234);
		System.out.println(a.toString());
		System.out.println(t.toString());
		System.out.println("Technical staff salary"+t.calSalary());
		System.out.println("------------staff----------------");
		System.out.println(a1.toString());
		System.out.println(s.toString());
		System.out.println("Staff salary"+s.calSalary());
		
		
	}

}

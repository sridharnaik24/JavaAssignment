package Assignment;

public class myOwnAutoshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car c=new Car(120, 150, "red");
		Sedan s=new Sedan(100,5000,"red");
		Ford f = new Ford(48,8000,"black",5000);
		Ford f1 = new Ford(33,99000,"black",4000);
		System.out.println("sedan Car\t"+s.getSalePrice(10));
		System.out.println(" ford car\t"+f.getSalePrice());
		System.out.println(" second ford car\t"+f1.getSalePrice());
	}

}

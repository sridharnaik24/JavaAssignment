package Assignment;

public class Tshirt {
	String color;
	String material;
	String design;
	Tshirt (String color, String material, String design){
		this.color=color;
		this.material=material;
		this.design=design;
	}
	public void small() {
		System.out.println("T shirt is small "+color+"\t"+material+"\t"+design);
	}
	public void large() {
	System.out.println("Tshirt is Large "+color+"\t"+material+"\t"+design);
	}
	public void x_large() {
		System.out.println("TShirt is Large "+color+"\t"+material+"\t"+design);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tshirt Small =new Tshirt("yellow","jeans","plane");
		Tshirt large =new Tshirt("pink","Polythene","dotted");
		Tshirt x_large =new Tshirt("violet","Cotton","lines");
		
		Small.small();
		large.large();
		x_large.x_large();	
	}

}

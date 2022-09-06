package fourthques;

public class Adress {
	int doorNo;
	String city;
	String street;
	int pincode;
	Adress(int doorNo, String city,String street,int pincode){
		this.doorNo=doorNo;
		this.city=city;
		this.street=street;
		this.pincode=pincode;
	}
	public String toString() {
		return "Adress\n"+doorNo+city+street+pincode;
	}
}


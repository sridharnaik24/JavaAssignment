package com.sonata.emodel;

public class Product {
	
	int prdId;
	String prdName;
	double prdPrice;
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getprdPrice() {
		return prdPrice;
	}
	public void setprdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
}

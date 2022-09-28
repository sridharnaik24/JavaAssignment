package com.sonata.emodel;

import java.util.List;

import com.sonata.DAOimpl.Productsimpl;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p= new Product();
		Product p1= new Product();
		
		Productsimpl pi=new Productsimpl();
		p.setPrdId(14);
		p.setPrdName("boofghj");
		p.setprdPrice(5000);
		
		p1.setPrdId(13);
		p1.setPrdName("pencil");
		p1.setprdPrice(200);
	
//		p2.setPrdId(p.getPrdId());
//		p2.setPrdName("pencil");
//		p2.setprdPrice(200);
//		p.setPrdName("pen");
//		p.setprdPrice(300.2);
		List<Product> s2 = pi.getdata();    	
        for(int i=0;i <s2.size();i++) {
        	System.out.println(s2.get(i).getPrdId());
        	System.out.println(s2.get(i).getPrdName());
        	System.out.println(s2.get(i).getprdPrice());
        }
		
		
		int a1=pi.save(p);
		int a2=pi.update(p); 
//		
		
		
		int a3=pi.delete(p);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
        }
	}


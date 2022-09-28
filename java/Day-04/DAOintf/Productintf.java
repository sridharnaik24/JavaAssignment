package com.sonata.DAOintf;

import java.util.List;

import com.sonata.emodel.Product;

public interface Productintf {
	
	public int save(Object object);
	public int update(Object object);
	public int delete(Object object);
	public List<Product> getdata();
		//public List<Product> updatedata();
	
}

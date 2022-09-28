package com.sonata.DAOimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.DAO.DBConnectionprd;
import com.sonata.DAOintf.Productintf;
import com.sonata.emodel.Product;

public class Productsimpl implements Productintf{
	DBConnectionprd db=new DBConnectionprd();
	int row=0;
	
	@Override
	public int save(Object object) {
		// TODO Auto-generated method stub
		Product p1= (Product) object;
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("insert into product values(?,?,?)");
			ps.setInt(1, p1.getPrdId());
			ps.setString(2, p1.getPrdName());
			ps.setDouble(3, p1.getprdPrice());
			row=ps.executeUpdate();
			db.closeConnection();
					}catch(SQLException e) {e.printStackTrace();}
		return row;
	}


	@Override
	public int update(Object object) {
		// TODO Auto-generated method stub
		Product p1= (Product) object;
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("UPDATE product SET prdName = ? , prdPrice = ? WHERE prdId = ?");
			ps.setInt(1, p1.getPrdId());
			ps.setString(2, p1.getPrdName());
			ps.setDouble(3, p1.getprdPrice());
			row=ps.executeUpdate();
			db.closeConnection();
					}catch(SQLException e) {e.printStackTrace();}
		return row;
	}


	@Override
	public List<Product> getdata() {
		// TODO Auto-generated method stub
		List<Product> prd = new ArrayList<Product>();
		   try {
			   PreparedStatement ps = db.getConnection().prepareStatement("select * from product");
			   ResultSet rs = ps.executeQuery();
			   
			   while (rs.next()) {
				   Product p2 = new Product();
				 p2.setPrdId(rs.getInt(1));
				 p2.setPrdName(rs.getNString(2));	
				 p2.setprdPrice(rs.getDouble(3));
				 prd.add(p2);
			   }
		
	}catch(SQLException e1) {e1.printStackTrace();}
		   
		   return prd;
}


	@Override
	public int delete(Object object) {
		// TODO Auto-generated method stub
		Product p1= (Product) object;
		try {
			PreparedStatement ps=db.getConnection().prepareStatement("DELETE FROM product WHERE prdId = ?");
			ps.setInt(1, p1.getPrdId());
//			ps.setString(2, p1.getPrdName());
//			ps.setDouble(3, p1.getprdPrice());
			row=ps.executeUpdate();
			db.closeConnection();
					}catch(SQLException e) {e.printStackTrace();}
		return row;
	}
}
	
	

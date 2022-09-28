package com.sonata.DAOimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.DAO.DBConnection;
import com.sonata.DAOintf.EmplyoeeIntf;
import com.sonata.emodel.Emplyoee;

public class Emplyoeeimpl implements EmplyoeeIntf{
	DBConnection db=new DBConnection();
	
	int row=0;
	@Override
	public int save(Object object) {
		// TODO Auto-generated method stub
		Emplyoee e1= (Emplyoee) object;
		try {
			
			PreparedStatement s1= db.getConnection().prepareStatement("insert into emplyoee values(?,?,?)");
			s1.setInt(1,e1.getEmpid());
			s1.setString(2, e1.getEmpname());
			s1.setDouble(3,e1.getEmpsal());
			row=s1.executeUpdate();
			db.closeConnection();
		
		}catch(SQLException e) {e.printStackTrace();}
		return row;
	}

//	@Override
//	public List<Emplyoee> getData() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

package com.sonata.emodel;

import com.sonata.DAOimpl.Emplyoeeimpl;

public class EmplyoeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoee e1=new Emplyoee();
		e1.setEmpid(111);
		e1.setEmpname("Ram");
		e1.setEmpsal(4000);

			Emplyoeeimpl p1=new Emplyoeeimpl();
			int a1=p1.save(e1);
			System.out.println(a1);
	}

}

package com.my.spring.dao;

import org.hibernate.HibernateException;

import com.my.spring.pojo.Vehicle;
import com.my.spring.pojo.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

public class VehicleDAO extends DAO{

	public List<Vehicle> get()
	 {
	try {
		begin();
		System.out.println("inside DAO");	
		Query q = getSession().createQuery("from Vehicle");
		List<Vehicle> list = q.list();
		commit();
		return list;
		
	
	} catch (HibernateException e) {
		rollback();
		throw e;
	}
	}
	
	public List<Vehicle> searchVehicle(String number)
	 {
	try {
		begin();
			
		Query q = getSession().createQuery("from Vehicle where number= :number");
		q.setString("number",number);
		List<Vehicle> list = q.list();
		commit();
		return list;
	
	} catch (HibernateException e) {
		rollback();
		throw e;
	}
	}
	

}

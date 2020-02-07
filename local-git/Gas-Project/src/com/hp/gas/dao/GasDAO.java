package com.hp.gas.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hp.gas.dto.GasDTO;

public class GasDAO 
{
	public void createGas(GasDTO gasDTO)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(gasDTO.getClass());
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans= session.beginTransaction();
		session.save(gasDTO);
		trans.commit();
		session.close();
		sf.close();
	}
	public void getGasDetails(int gasNumber)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(GasDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		GasDTO gasDTO = new GasDTO();
		gasDTO = session.get(GasDTO.class, gasNumber);
		System.out.println("Gas Details: "+gasDTO);
		session.close();
		sf.close();
	}
	public void updateGasDetails(int gasNumber, int gasCost)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(GasDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		GasDTO gasDto = new GasDTO();
		gasDto.setCost(gasCost);
		session.update(gasDto);
		transaction.commit();
		System.out.println("Gas details are updated"+ gasDto);
		session.close();
		sf.close();
	}
	public void deleteGasDetails(int gasNumber)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(GasDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		GasDTO gasDto = new GasDTO();
		gasDto = session.get(GasDTO.class, gasNumber);
		session.delete(gasDto);
		System.out.println("Deleted the record in Database");
		transaction.commit();
		session.close();
		sf.close();
	}
}

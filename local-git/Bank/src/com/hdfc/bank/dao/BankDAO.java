package com.hdfc.bank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hdfc.bank.dto.BankDTO;

public class BankDAO {

	
	public BankDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void createBank(BankDTO bankDTO)
	{
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BankDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bankDTO);
		transaction.commit();
		session.close();
		factory.close();
		
	}
	
	public BankDTO getBank(String id)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BankDTO.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
	    BankDTO bankDTO =	new BankDTO();
	    bankDTO = session.get(BankDTO.class,id);
	    System.out.println("Retrived Bank Details: "+bankDTO);
	    //transaction.commit();
	    session.close();
	    sessionFactory.close();
	    return bankDTO;
	}
	
	public void updateBank(String id,String location)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BankDTO.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	   // BankDTO bankDTO =	new BankDTO();
		BankDTO bankDTO = session.get(BankDTO.class, id);
	    bankDTO.setBankLocation(location);
	    session.update(bankDTO);
	    System.out.println("Retrived Bank Details: "+bankDTO);
	    transaction.commit();
	    session.close();
	    sessionFactory.close();
	}
	
	public void deleteBank(String id)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BankDTO.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	   // BankDTO bankDTO =	new BankDTO();
		BankDTO bankDTO = session.get(BankDTO.class, id);
	    session.delete(bankDTO);
	    System.out.println("Retrived Bank Details: "+bankDTO);
	    transaction.commit();
	    session.close();
	    sessionFactory.close();
	}
	public BankDTO getBankDetails(String bankId)
	{
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BankDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		//Transaction transaction = session.beginTransaction();
		BankDTO bankDto = session.get(BankDTO.class, bankId);
		System.out.println("Bankdetails: "+bankDto);
		//transaction.commit();
		session.close();
		factory.close();
		return bankDto;
	}
	
	public void updateBankDetails(String id, String location)
	{
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BankDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		BankDTO bankDto = session.get(BankDTO.class, id);
		if(bankDto!=null)
		{
			bankDto.setBankLocation(location);
			session.update(bankDto);
			System.out.println("Bankdetails: "+bankDto);
			transaction.commit();
		}
		session.close();
		factory.close();
	}
	//used persist() instead of save();
	public void insertBankIntoDBbyUsingPersist(BankDTO bankDTO)
	{
		System.out.println("Entered inside the Persist method");
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BankDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		//used persist method instead of save();
		session.persist(bankDTO);
		transaction.commit();
		session.close();
		factory.close();
		
	}
	//used saveorupdate() instead of save();
	public void insertBankIntoDBbyUsingSaveOrUpdate(BankDTO bankDTO)
	{
		System.out.println("Entered inside the SaveOrUpdate method");
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BankDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		//used persist method instead of save();
		session.saveOrUpdate(bankDTO);
		transaction.commit();
		session.close();
		factory.close();
		
	}
	//used load method instead of get();
	public void loadbank(String id)
	{
		System.out.println("Entered inside");
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BankDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		BankDTO bankdto = new BankDTO();
		//used load method instead of get();
		bankdto = session.load(BankDTO.class, id);
		if(bankdto!=null)
		{
			System.out.println("Bank Details: "+bankdto);
		}
	}
	//used merge instead of update
	public void updateBankDetailsUsingMerge(String id, String location)
	{
		System.out.println("Entered inside the updateBankDetailsUsingMerge");
		Configuration  configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BankDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		BankDTO bankDto = session.get(BankDTO.class, id);
		if(bankDto!=null)
		{
			bankDto.setBankLocation(location);
			//used merge() instead of update();
			session.merge(bankDto);
			System.out.println("Bankdetails: "+bankDto);
			transaction.commit();
		}
		session.close();
		factory.close();
	}
	
}

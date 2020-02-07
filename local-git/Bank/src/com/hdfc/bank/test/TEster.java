package com.hdfc.bank.test;

import com.hdfc.bank.dao.BankDAO;
import com.hdfc.bank.dto.BankDTO;

public class TEster {

	
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to main method");
		
		
		BankDTO bankDTO = new BankDTO();
		bankDTO.setBankId("HDBC34ttt56");
		bankDTO.setBankName("HDFtttC");
		bankDTO.setBankLocation("Rajajintagar");
	    bankDTO.setBankType("Privtate");
	    
	    BankDAO bankDAO= new BankDAO();
	   // bankDAO.createBank(bankDTO);
	    bankDAO.getBank("HDBC3456");
	    bankDAO.getBankDetails("HDBC3456");
	   // bankDAO.updateBank("HDBC34ttt56", "Hebbal");
	    
	  //  bankDAO.deleteBank("HDBC34ttt56");
	    bankDAO.updateBank("HDBC3456", "Mysore");
	    bankDAO.loadbank("HDBC3456");
	    bankDAO.updateBankDetailsUsingMerge("HDBC3456", "Tumkur");
	    
	    bankDTO.setBankId("HDFC0203");
	    bankDTO.setBankLocation("Hydrabad");
	    bankDTO.setBankName("HDFC BANK");
	    bankDTO.setBankType("Private");
	    bankDAO.insertBankIntoDBbyUsingSaveOrUpdate(bankDTO);
	    
	    bankDTO.setBankId("HDFC0206");
	    bankDTO.setBankLocation("Mangalore");
	    bankDTO.setBankName("HDFC BANK");
	    bankDTO.setBankType("Private");
	    bankDAO.insertBankIntoDBbyUsingPersist(bankDTO);
	}
}

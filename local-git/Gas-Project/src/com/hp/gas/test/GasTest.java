package com.hp.gas.test;

import com.hp.gas.dao.GasDAO;
import com.hp.gas.dto.GasDTO;

public class GasTest 
{
	public static void main(String args[])
	{
		GasDAO gasDao = new GasDAO();
		GasDTO gasDTO = new GasDTO();
		gasDTO.setGasName("Indian Cylinder");
		gasDTO.setGasNumber(444);
		gasDTO.setCost(900);
		
		//gasDao.createGas(gasDTO);
		gasDao.getGasDetails(222);
		//gasDao.updateGasDetails(222, 1200);
		gasDao.deleteGasDetails(123);
		
	}
}
package com.g3farm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3farm.dao.IFarmerDao;
import com.g3farm.model.G3FarmFarmer;


@Service
@Transactional
public class FarmerServiceImplement implements IFarmerService {
	@Autowired
	
	private IFarmerDao farmerDao;
	@Transactional
	public void addFarmer(G3FarmFarmer f) {
		// TODO Auto-generated method stub
		farmerDao.addFarmer(f);
		
	}

	@Transactional
	public G3FarmFarmer updateFarmer(G3FarmFarmer f) {
		// TODO Auto-generated method stub
		return farmerDao.updateFarmer(f);
	}
	@Transactional
	public List<G3FarmFarmer> listFarmer() {
		// TODO Auto-generated method stub
		return farmerDao.listFarmer();
	}

	public G3FarmFarmer getFarmerById(int id) {
		// TODO Auto-generated method stub
		return farmerDao.getFarmerById(id);
	}

	public void removeFarmer(int id) {
		// TODO Auto-generated method stub
		farmerDao.removeFarmer(id);
	}

	public void setFarmerDao(IFarmerDao farmerDao) {
		this.farmerDao = farmerDao;
	}

}

package com.g3farm.dao;
import java.util.List;

import com.g3farm.model.G3FarmFarmer;
public interface IFarmerDao {
	public void addFarmer(G3FarmFarmer f);
	public  G3FarmFarmer updateFarmer(G3FarmFarmer f);
	public List<G3FarmFarmer> listFarmer();
	public G3FarmFarmer getFarmerById(int id);
	public void removeFarmer(int id);


}

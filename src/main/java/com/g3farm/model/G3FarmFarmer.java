package com.g3farm.model;
import javax.persistence.*;
@Entity
@Table(name = "Farm_Farmers")

public class G3FarmFarmer {
	@Id 
	@Column(name = "FId")
	private int FId;
	@Column(name = "FName")
	private String  FName;
	@Column(name = "FContact")
	private int FContact;
	@Column(name = "Password")
	private String  Password;
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getFId() {
		return FId;
	}
	public void setFId(int fId) {
		FId = fId;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public int getFContact() {
		return FContact;
	}
	public void setFContact(int fContact) {
		FContact = fContact;
	}
	

}













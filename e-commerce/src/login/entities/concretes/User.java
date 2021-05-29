package login.entities.concretes;

import login.entities.abstracts.Entity;

public class User implements Entity{

	private String firtsName;
	private String lastName;
	private String mail;
	private String password;
	
	public User(String firtsName, String lastName, String mail, String password) {
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}

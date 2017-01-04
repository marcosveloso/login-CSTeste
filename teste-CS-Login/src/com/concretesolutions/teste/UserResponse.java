package com.concretesolutions.teste;


import java.io.Serializable;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserResponse implements Serializable{

	private static final long serialVersionUID = 6493423071624030721L;

	private String id;
    private LocalDate created;
    private LocalDate modified; //data da última atualização do usuário
    private LocalDate lastLogin; // data do último login
    private String token;
    
    public UserResponse() {}

    public UserResponse(String id, LocalDate creation, LocalDate modify, LocalDate lastLogin,
    		String token) {
    	this.id = id;
    	this.created = creation;
    	this.modified = modify;
    	this.lastLogin = lastLogin;
    	this.token = token;	
    }
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getCreated() {
		return created;
	}
	public void setCreated(LocalDate created) {
		this.created = created;
	}
	public LocalDate getModified() {
		return modified;
	}
	public void setModified(LocalDate modified) {
		this.modified = modified;
	}
	public LocalDate getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDate lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}

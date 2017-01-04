package com.concretesolutions.teste;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserData implements Serializable{

    private static final long serialVersionUID = 6826191735682596960L;

    private String name;
    private String email;
    private String password;
    private PhoneNumber[] phones;
    
    public UserData() {}
    
    public UserData( String name, String email, String password, Object[] phones) {
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setPhones(convert(phones));        
    }

    private PhoneNumber[] convert(Object[] phones2) {
		// TODO Auto-generated method stub
		return null;
	}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PhoneNumber[] getPhones() {
		return phones;
	}

	public void setPhones(PhoneNumber[] phones) {
		this.phones = phones;
	}

}
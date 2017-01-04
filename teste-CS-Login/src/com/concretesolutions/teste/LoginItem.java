package com.concretesolutions.teste;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
import com.pegaxchange.java.bean.Product;
import com.pegaxchange.java.bean.Status;
*/

@Path("dologin")
public class LoginItem {

    public LoginItem() {
        
    }

    @GET
    @Path("userlogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getLogIn(String name) {
    	try{
    		return createUser(name);
    	} catch (Exception ex) {
    		return getUser(name);
    	}
    }
    
    private String getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	private String createUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
    @Path("userlogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String postLogIn(String name) {
    	try{
    		return createUser(name);
    	} catch (Exception ex) {
    		return getUser(name);
    	}
    }

}

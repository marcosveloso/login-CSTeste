package com.concretesolutions.teste;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("loginservice")
public class Login extends ResourceConfig {

    public Login() {
        packages("com.fasterxml.jackson.jaxrs.json");
        packages("com.concretesolutions.teste");
    }
}

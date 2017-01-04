package com.concretesolutions.teste;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage implements Serializable {

    private static final long serialVersionUID = -9130603850117689481L;

    private String status;
    private String message;
    
    public ErrorMessage() {} 
    
    public ErrorMessage(String status, String message) {
        this.status = status;
        this.message = message;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
package com.example.WebSite.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Consultation {
    private String name;
    private  String phone;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Consultation(){
    }

    public Consultation(String name, String phone, String message) {
        this.name = name;
        this.phone = phone;
        this.message =message;
    }
}

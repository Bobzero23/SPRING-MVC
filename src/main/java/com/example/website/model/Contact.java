package com.example.website.model;

/*imports*/
import lombok.Data;

@Data
public class Contact {

    /*fields*/
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;

}

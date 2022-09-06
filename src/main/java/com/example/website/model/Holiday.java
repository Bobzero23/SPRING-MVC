package com.example.website.model;

/*imports*/
import lombok.Data;

@Data
public class Holiday {

    /*fields*/
    private  final String day;
    private final String reason;
    private final Type type;

    /*Enum*/
    public enum Type{
        FESTIVAL, FEDERAL;
    }

}

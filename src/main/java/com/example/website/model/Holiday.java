package com.example.website.model;

public class Holiday {

    /*fields*/
    private  final String day;
    private final String reason;
    private final Type type;

    /*Enum*/
    public enum Type{
        FESTIVAL, FEDERAL;
    }

    /*constructor*/
    public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

    /*******GETTERS*********/

    public String getDay() {
        return day;
    }

    public String getReason() {
        return reason;
    }

    public Type getType() {
        return type;
    }
}

package com.ifi.moviebooking.entity;

public enum  Eticket {
    ETICKET2D("2D"),
    ETICKET3D("3D");
    private String value;

    Eticket(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

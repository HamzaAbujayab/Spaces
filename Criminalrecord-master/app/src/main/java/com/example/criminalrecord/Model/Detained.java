package com.example.criminalrecord.Model;

public class Detained {
    private String namePoliceStation;
    private String startOfArrest;
    private String extensionExpires;
    private String engorge;

    public Detained() {
    }

    public Detained(String namePoliceStation, String startOfArrest, String extensionExpires, String engorge) {
        this.namePoliceStation = namePoliceStation;
        this.startOfArrest = startOfArrest;
        this.extensionExpires = extensionExpires;
        this.engorge = engorge;
    }

    public String getNamePoliceStation() {
        return namePoliceStation;
    }

    public void setNamePoliceStation(String namePoliceStation) {
        this.namePoliceStation = namePoliceStation;
    }

    public String getStartOfArrest() {
        return startOfArrest;
    }

    public void setStartOfArrest(String startOfArrest) {
        this.startOfArrest = startOfArrest;
    }

    public String getExtensionExpires() {
        return extensionExpires;
    }

    public void setExtensionExpires(String extensionExpires) {
        this.extensionExpires = extensionExpires;
    }

    public String getEngorge() {
        return engorge;
    }

    public void setEngorge(String engorge) {
        this.engorge = engorge;
    }
}

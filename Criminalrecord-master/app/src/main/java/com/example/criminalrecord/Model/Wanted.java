package com.example.criminalrecord.Model;

public class Wanted {

    String name_police_station;
    String date_for_wanted;
    String state_for_wanted;

    public Wanted() {
    }

    public Wanted(String name_police_station, String date_for_wanted, String state_for_wanted) {
        this.name_police_station = name_police_station;
        this.date_for_wanted = date_for_wanted;
        this.state_for_wanted = state_for_wanted;
    }

    public String getName_police_station() {
        return name_police_station;
    }

    public void setName_police_station(String name_police_station) {
        this.name_police_station = name_police_station;
    }

    public String getDate_for_wanted() {
        return date_for_wanted;
    }

    public void setDate_for_wanted(String date_for_wanted) {
        this.date_for_wanted = date_for_wanted;
    }

    public String getState_for_wanted() {
        return state_for_wanted;
    }

    public void setState_for_wanted(String state_for_wanted) {
        this.state_for_wanted = state_for_wanted;
    }
}

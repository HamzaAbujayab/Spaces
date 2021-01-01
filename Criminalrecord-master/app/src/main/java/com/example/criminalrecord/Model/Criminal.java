package com.example.criminalrecord.Model;

public class Criminal {

    private String numberOfInference;
    private String historyOfCase;
    private String namePoliceStation;
    private String dateClosed;

    public Criminal() {
    }

    public Criminal(String numberOfInference, String historyOfCase, String namePoliceStation, String dateClosed) {
        this.numberOfInference = numberOfInference;
        this.historyOfCase = historyOfCase;
        this.namePoliceStation = namePoliceStation;
        this.dateClosed = dateClosed;
    }

    public String getNumberOfInference() {
        return numberOfInference;
    }

    public void setNumberOfInference(String numberOfInference) {
        this.numberOfInference = numberOfInference;
    }

    public String getHistoryOfCase() {
        return historyOfCase;
    }

    public void setHistoryOfCase(String historyOfCase) {
        this.historyOfCase = historyOfCase;
    }

    public String getNamePoliceStation() {
        return namePoliceStation;
    }

    public void setNamePoliceStation(String namePoliceStation) {
        this.namePoliceStation = namePoliceStation;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

}

package com.example.criminalrecord.Model;

public class Travel {

    String nameCrossing;
    String typeOfTravel;
    String dateOfVisit;
    String reasonForVisit;

    public Travel() {
    }

    public Travel(String nameCrossing, String typeOfTravel, String dateOfVisit, String reasonForVisit) {
        this.nameCrossing = nameCrossing;
        this.typeOfTravel = typeOfTravel;
        this.dateOfVisit = dateOfVisit;
        this.reasonForVisit = reasonForVisit;
    }


    public String getNameCrossing() {
        return nameCrossing;
    }

    public void setNameCrossing(String nameCrossing) {
        this.nameCrossing = nameCrossing;
    }

    public String getTypeOfTravel() {
        return typeOfTravel;
    }

    public void setTypeOfTravel(String typeOfTravel) {
        this.typeOfTravel = typeOfTravel;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }
}

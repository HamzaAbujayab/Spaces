package com.example.criminalrecord.Model;

import android.net.Uri;

public class FamilyRelation {

    String name ;
    String typeOfRelation;
    String idNumber;
    String dateOfBirth;
    String image;

    public FamilyRelation() {
    }

    public FamilyRelation(String name, String typeOfRelation, String idNumber, String dateOfBirth, String image) {
        this.name = name;
        this.typeOfRelation = typeOfRelation;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfRelation() {
        return typeOfRelation;
    }

    public void setTypeOfRelation(String typeOfRelation) {
        this.typeOfRelation = typeOfRelation;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBarth) {
        this.dateOfBirth = dateOfBarth;
    }
}

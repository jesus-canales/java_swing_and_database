package com.entrecodigosycafe.professorapp.model;

public class ProfessorEntity {
    private int id;
    private String name;
    private String lastName;
    private String birthDate;
    private String placeOfOrigin;
    private String gender;
    private String technologies;
    private String modality;


    public ProfessorEntity(String name, String lastName, String birthDate, String placeOfOrigin, String gender, String technologies, String modality) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.placeOfOrigin = placeOfOrigin;
        this.gender = gender;
        this.technologies = technologies;
        this.modality = modality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }
}

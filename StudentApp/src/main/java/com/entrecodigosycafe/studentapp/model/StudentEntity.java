package com.entrecodigosycafe.studentapp.model;

public class StudentEntity {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String country;
    private String email;
    private String phone;

    public StudentEntity(int id, String name, String lastName, int age, String country, String email, String phone) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

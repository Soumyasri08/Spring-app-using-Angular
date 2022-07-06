package com.getarrays.employeemanager.model;


import javax.persistence.*;
import java.io.Serializable;


//We are using Serializable because this helps transfer java class to different streams such as Json , database etc..
//We need to map this class to a JPA repository so we are using @Entity
@Entity
public class Employee implements Serializable {

    //Since Id is a primaryKey
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) //We don't need to enter the value it will be gerneated automatically
    @Column(nullable = false, updatable = false) //And Id column cannot be a null or updatable
    
    //This class contains all the required attributes
    //We have stters and getters for these attributes along with constructor and toString.
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageURL;
    @Column(nullable = false,updatable = false) //similar as Id
    private String employeeCode;

    public Employee(String name, String email, String jobTitle, String phone, String imageURL,
                String employeeCode) {


        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageURL = imageURL;
        this.employeeCode = employeeCode;
    }



    public Long getId() {

        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }



    @Override
    public String toString() {
        return "Employee {" +
               "id=" + id +
                ", name=" + name + '\''+
                ", email=" + email + '\''+
                ", jobTitle=" + jobTitle + '\''+
                ", phone=" + phone + '\''+
                ", imageURL=" + imageURL + '\''+
                ", employeeCode=" + employeeCode + '\''+
                "}";
    }






}

package com.moringaflow.bug.tracker.model;

import javax.persistence.*;
import java.io.Serializable;

//create a model class
//add private id,name,email,etc
//implements Serializable
@Entity
public class Developer implements Serializable {

//    add decorators tos specify what to do with the data on top of each data
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobName;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String developerCode;

//    create an empty constructor
    public Developer() {}

//    generate constructor
    public Developer(String name, String email, String jobName, String phone, String imageUrl, String developerCode) {

        this.name = name;
        this.email = email;
        this.jobName = jobName;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.developerCode = developerCode;
    }

//    generate getters and setter
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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDeveloperCode() {
        return developerCode;
    }

    public void setDeveloperCode(String developerCode) {
        this.developerCode = developerCode;
    }


//    Generated toString() metthod
    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobName='" + jobName + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", developerCode='" + developerCode + '\'' +
                '}';
    }
}

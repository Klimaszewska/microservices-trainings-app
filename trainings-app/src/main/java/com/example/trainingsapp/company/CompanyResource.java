package com.example.trainingsapp.company;

import com.example.trainingsapp.training.TrainingResource;

import java.util.List;

public class CompanyResource {

    private String companyName;

    private String companyDescription;

    private String companyNIP;

    private List<TrainingResource> trainings;

    public CompanyResource(String companyName, String companyNIP) {
        this.companyName = companyName;
        this.companyNIP = companyNIP;
    }

    public CompanyResource() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCompanyNIP() {
        return companyNIP;
    }

    public void setCompanyNIP(String companyNIP) {
        this.companyNIP = companyNIP;
    }

    public List<TrainingResource> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<TrainingResource> trainings) {
        this.trainings = trainings;
    }
}

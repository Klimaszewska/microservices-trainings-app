package com.example.trainingsapp.training;

import com.example.trainingsapp.company.CompanyResource;
import com.example.trainingsapp.trainingstatus.TrainingStatus;

public class TrainingResource {

    private String trainingName;

    private String trainingDescription;

    private TrainingStatus trainingStatus;

    private boolean isInitial;

    private CompanyResource company;

    public TrainingResource(String trainingName, TrainingStatus trainingStatus, boolean isInitial) {
        this.trainingName = trainingName;
        this.trainingStatus = TrainingStatus.ACTIVE;
        this.isInitial = isInitial;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getTrainingDescription() {
        return trainingDescription;
    }

    public void setTrainingDescription(String trainingDescription) {
        this.trainingDescription = trainingDescription;
    }

    public TrainingStatus getTrainingStatus() {
        return trainingStatus;
    }

    public void setTrainingStatus(TrainingStatus trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public void setInitial(boolean initial) {
        isInitial = initial;
    }

    public CompanyResource getCompany() {
        return company;
    }

    public void setCompany(CompanyResource company) {
        this.company = company;
    }
}

package com.example.trainingsapp.training;

import com.example.trainingsapp.commons.Status;

public class TrainingResource {

    private String trainingName;

    private String trainingDescription;

    private Status status;

    private boolean isInitial;

    public TrainingResource(String trainingName, Status status, boolean isInitial) {
        this.trainingName = trainingName;
        this.status = Status.ACTIVE;
        this.isInitial = isInitial;
    }

    public TrainingResource() {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public void setInitial(boolean initial) {
        isInitial = initial;
    }
}

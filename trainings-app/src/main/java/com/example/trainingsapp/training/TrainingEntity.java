package com.example.trainingsapp.training;

import com.example.trainingsapp.commons.BasicEntity;
import com.example.trainingsapp.commons.Status;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "trainings")
public class TrainingEntity extends BasicEntity {

    @NotBlank
    private String trainingName;

    private String trainingDescription;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    private boolean isInitial;

    public TrainingEntity() {
        status = Status.ACTIVE;
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

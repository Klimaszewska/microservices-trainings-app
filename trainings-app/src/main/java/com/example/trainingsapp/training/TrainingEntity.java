package com.example.trainingsapp.training;

import com.example.trainingsapp.commons.BasicEntity;
import com.example.trainingsapp.company.CompanyEntity;
import com.example.trainingsapp.trainingstatus.TrainingStatus;

import javax.persistence.*;
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
    private TrainingStatus trainingStatus;

    @NotNull
    private boolean isInitial;

    @ManyToOne
    private CompanyEntity companyEntity;

    public TrainingEntity() {
        trainingStatus = TrainingStatus.ACTIVE;
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

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }
}

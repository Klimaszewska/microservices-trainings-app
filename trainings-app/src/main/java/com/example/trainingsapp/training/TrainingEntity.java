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


}

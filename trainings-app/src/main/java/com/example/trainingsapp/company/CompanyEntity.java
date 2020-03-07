package com.example.trainingsapp.company;

import com.example.trainingsapp.commons.BasicEntity;
import com.example.trainingsapp.training.TrainingEntity;
import org.hibernate.validator.constraints.pl.NIP;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
public class CompanyEntity extends BasicEntity {

    @NotBlank
    private String companyName;

    private String companyDescription;

    @NIP
    private String companyNIP;

    @OneToMany
    private List<TrainingEntity> trainings;

    public CompanyEntity() {
        trainings = new ArrayList<>();
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

    public List<TrainingEntity> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<TrainingEntity> trainings) {
        this.trainings = trainings;
    }
}

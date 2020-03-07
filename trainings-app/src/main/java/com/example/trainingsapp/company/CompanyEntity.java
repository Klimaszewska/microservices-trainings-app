package com.example.trainingsapp.company;

import com.example.trainingsapp.commons.BasicEntity;
import com.example.trainingsapp.training.TrainingEntity;
import org.hibernate.validator.constraints.pl.NIP;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
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


}

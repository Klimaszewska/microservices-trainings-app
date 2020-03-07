package com.example.trainingsapp.utils;

import com.example.trainingsapp.company.CompanyEntity;
import com.example.trainingsapp.company.CompanyRepository;
import com.example.trainingsapp.training.TrainingEntity;
import com.example.trainingsapp.training.TrainingRepository;
import com.example.trainingsapp.trainingstatus.TrainingStatus;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

// the class pre-fills the database with sample data
@Component
public class DatabasePreFill {

    private CompanyRepository companyRepository;
    private TrainingRepository trainingRepository;

    public DatabasePreFill(CompanyRepository companyRepository, TrainingRepository trainingRepository) {
        this.companyRepository = companyRepository;
        this.trainingRepository = trainingRepository;
    }

    @PostConstruct
    private void saveSampleCompany(){
        CompanyEntity sampleCompany = new CompanyEntity();
        sampleCompany.setCompanyName("Test Company");
        sampleCompany.setCompanyDescription("Test Description");
        sampleCompany.setCompanyNIP("8949485312");
        sampleCompany.setTrainings(new ArrayList<TrainingEntity>());
        companyRepository.save(sampleCompany);
    }

    @PostConstruct
    private void saveSampleTraining(){
        TrainingEntity sampleTraining = new TrainingEntity();
        sampleTraining.setTrainingName("Test Training Name");
        sampleTraining.setTrainingDescription("Test Training Description");
        sampleTraining.setTrainingStatus(TrainingStatus.ACTIVE);
        sampleTraining.setInitial(true);
        trainingRepository.save(sampleTraining);
    }

}

package com.example.trainingsapp.utils;

import com.example.trainingsapp.commons.Status;
import com.example.trainingsapp.company.CompanyEntity;
import com.example.trainingsapp.company.CompanyRepository;
import com.example.trainingsapp.training.TrainingEntity;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

// the class pre-fills the database with sample data
@Component
public class DatabasePreFill {

    private CompanyRepository companyRepository;

    public DatabasePreFill(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @PostConstruct
    private void saveSampleCompanyWithTraining() {
        TrainingEntity sampleTraining = new TrainingEntity();
        sampleTraining.setTrainingName("Test Training Name");
        sampleTraining.setTrainingDescription("Test Training Description");
        sampleTraining.setStatus(Status.ACTIVE);
        sampleTraining.setInitial(true);

        List<TrainingEntity> trainings = new ArrayList<>();
        trainings.add(sampleTraining);

        CompanyEntity sampleCompany = new CompanyEntity();
        sampleCompany.setCompanyName("Test Company");
        sampleCompany.setCompanyDescription("Test Description");
        sampleCompany.setCompanyNIP("8949485312");
        sampleCompany.setTrainings(trainings);
        companyRepository.save(sampleCompany);
    }

}

package com.example.trainingsapp.company;

import com.example.trainingsapp.commons.Status;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.lang.reflect.Type;
import java.util.List;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;
    private ModelMapper modelMapper;

    public CompanyService(CompanyRepository companyRepository, ModelMapper modelMapper) {
        this.companyRepository = companyRepository;
        this.modelMapper = modelMapper;
    }

    public List<CompanyResource> getAllCompanies() {
        List<CompanyEntity> companyEntities = companyRepository.findAll();
        Type listType = new TypeToken<List<CompanyResource>>() {
        }.getType();
        List<CompanyResource> companyResources = modelMapper.map(companyEntities, listType);
        return companyResources;
    }

    public CompanyResource getCompanyById(Long id) {
        CompanyEntity companyEntity = this.companyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        CompanyResource companyResource = modelMapper.map(companyEntity, CompanyResource.class);
        return companyResource;
    }

    public void createCompany(CompanyResource companyResource) {
        CompanyEntity companyEntity = modelMapper.map(companyResource, CompanyEntity.class);
        companyRepository.save(companyEntity);
    }

    public void deactivateCompany(Long id) {
        CompanyEntity companyEntity = this.companyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        companyEntity.setStatus(Status.INACTIVE);
        companyRepository.save(companyEntity);
    }
}

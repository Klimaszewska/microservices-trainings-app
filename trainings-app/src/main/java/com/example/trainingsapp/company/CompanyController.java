package com.example.trainingsapp.company;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(path = "/{id}")
    public CompanyResource getCompanyById(@PathVariable("id") Long id) {
        CompanyResource company = companyService.getCompanyById(id);
        return company;
    }

    @GetMapping(path = "/")
    public List<CompanyResource> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping(path = "/")
    public void createCompany(@RequestBody CompanyResource companyResource) {
        companyService.createCompany(companyResource);
    }

    @PatchMapping(path = "/{id}")
    public void deactivateCompany(@PathVariable("id") Long id) {
        companyService.deactivateCompany(id);
    }

}

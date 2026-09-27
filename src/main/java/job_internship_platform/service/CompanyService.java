package job_internship_platform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import job_internship_platform.entity.Company;

@Service
public class CompanyService {

    public List<Company> getAllCompanies() {
        return Company.companies;
    }

}
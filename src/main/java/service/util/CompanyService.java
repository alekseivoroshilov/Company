package service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import service.entity.Residential;
import service.exceptions.CompanyNotFoundException;
import service.exceptions.NoResidentialFoundException;
import service.entity.Company;
import service.repository.CompanyDAO;
import service.repository.ResidentialDAO;

import java.util.List;

@Service("dataService")
public class CompanyService {

    @Autowired
    private CompanyDAO company_repository;
    private ResidentialDAO residential_repository;

    public Company getById(int companyId) {
        Company company = company_repository.getOne(companyId);
        if (company == null) throw new CompanyNotFoundException();
        return company;
    }

    public List<Company> getAll(int companyId) {
        List<Company> list = company_repository.findAllByCompanyId(companyId);
        if (list.isEmpty()) throw new CompanyNotFoundException();
        return list;
    }
    public Company createCompany(Company newCompany) {
        return company_repository.save(newCompany);
    }
    public List<Residential> getResidentials(@PathVariable int companyId){
        List<Residential> list = residential_repository.findAllByCompanyId(companyId);
        if (list.isEmpty()) throw new NoResidentialFoundException();
        return list;
    }
}

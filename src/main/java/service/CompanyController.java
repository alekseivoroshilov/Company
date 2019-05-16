package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.entity.Company;
import service.entity.Residential;
import service.util.CompanyService;

import java.util.List;

@Controller
@RestController
@EnableAutoConfiguration
@ComponentScan("service")
public class CompanyController {

    @Autowired
    @Qualifier("dataService")
    private CompanyService util;

    //@RequestMapping
    @GetMapping("/company/{id}")
    @ResponseBody
    private Company getCompanyById(@PathVariable int id) {
        return util.getById(id);
    }

    @GetMapping("/getAll/{companyId}")
    @ResponseBody
    private List<Company> getAll(@PathVariable int companyId) {
        return util.getAll(companyId);
    }

    @PutMapping("/createCompany/{companyJSON}")
    @ResponseBody
    private Company createCompany(@PathVariable Company companyJSON){
        return util.createCompany(companyJSON);
    }

    @GetMapping("/getResidentials/{companyId}")
    @ResponseBody
    private List<Residential> getResidentials(@PathVariable int companyId){
        return util.getResidentials(companyId);
    }
}

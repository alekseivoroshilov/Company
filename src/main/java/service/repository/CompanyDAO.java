package service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.entity.Company;

import java.util.List;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Integer> {
    List<Company> findAllByCompanyId(int companyId);
}
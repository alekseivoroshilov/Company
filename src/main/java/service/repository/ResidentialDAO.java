package service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.entity.Residential;

import java.util.List;

@Repository
public interface ResidentialDAO extends JpaRepository<Residential, Integer> {
    List<Residential> findAllByCompanyId(int companyId);
}
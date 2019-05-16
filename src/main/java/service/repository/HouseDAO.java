package service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import service.entity.House;

import java.util.List;

@Repository
public interface HouseDAO extends JpaRepository<House, Integer> {
    List<House> findAllByResidentialId(int residentialId);
}
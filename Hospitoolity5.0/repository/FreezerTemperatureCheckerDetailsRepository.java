package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.model.FreezerTemperatureCheckerDetails;

@Repository
public interface FreezerTemperatureCheckerDetailsRepository extends JpaRepository<FreezerTemperatureCheckerDetails, Integer>{

}

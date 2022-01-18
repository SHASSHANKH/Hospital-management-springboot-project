package management.springbackendhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import management.springbackendhospital.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	
}

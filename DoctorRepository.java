package management.springbackendhospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import management.springbackendhospital.entity.Doctor;
import management.springbackendhospital.entity.Patient;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	Object save(Patient patient);

	

}

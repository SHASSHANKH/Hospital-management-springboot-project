package management.springbackendhospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import management.springbackendhospital.entity.Doctor;
import management.springbackendhospital.entity.Patient;
import management.springbackendhospital.exception.ResourceNotFound;
import management.springbackendhospital.repository.DoctorRepository;
import management.springbackendhospital.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	
	@Autowired
	private DoctorRepository docrepo;
	
	@Autowired
	private PatientRepository patrepo;
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors(){
		return docrepo.findAll();
		
	}
	
	@PostMapping("/createdoctor")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return docrepo.save(doctor);
	}
	
	@PostMapping("/createPatient")
	public Patient createPatient(@RequestBody Patient patient) {
		return patrepo.save(patient);
	}
	
	
	@GetMapping("/patients")
	public List<Patient> getAllPatient(){
		return patrepo.findAll();
		
	}
	
	
	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
		Patient patient=patrepo.findById(id)
				.orElseThrow(()-> new ResourceNotFound("Patient not exist with id " +id));
		
		return ResponseEntity.ok(patient);
	}

}

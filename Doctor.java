package management.springbackendhospital.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="gender")
	private String gender;
	
	@Column(name = "age")
	private Long age;
	
	@Column(name ="specialization")
	private String specialization;
	
	@OneToMany(mappedBy = "doctor")
	private List<Patient> patient ;

	
	
	public Doctor() {
		
	}
	
	public Doctor(String name, String gender, Long age, String specialization) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.specialization = specialization;
	}
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}

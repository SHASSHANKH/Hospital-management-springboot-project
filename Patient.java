package management.springbackendhospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;
//import java.sql.Date;

@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "visited_doctor")
	private String VD;
	
	@Column(name = "DateofVisit")
	private Date DoV;
	
	@ManyToOne
	private Doctor doctor;
	
	public Patient() {}
	
	public Patient(String name, String vD, Date doV) {
		super();
		this.name = name;
		VD = vD;
		DoV = doV;
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
	public String getVD() {
		return VD;
	}
	public void setVD(String vD) {
		VD = vD;
	}
	public Date getDoV() {
		return DoV;
	}
	public void setDoV(Date doV) {
		DoV = doV;
	}

	//id, name , visitedDoctor, dateOfVisit
	
}

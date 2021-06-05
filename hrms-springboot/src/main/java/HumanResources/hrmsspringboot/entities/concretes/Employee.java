package HumanResources.hrmsspringboot.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employeeId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Size(min = 11,max = 11,message = "11 karakter olmalı")
	@NotBlank(message = "Boş olmamalı")
	@Column(name = "nationality_id")
	private String nationalityId;

	@Column(name = "date_of_birth")
	private int dateOfBirth;

	@Column(name = "email")
	private String email;

	@Column(name="job_description")
	private String jobDescription;
	
	//@Column(name="job_id")
	//private String jobId;

	@Column(name = "password")
	private String password;

	@Column(name = "verified_password")
	private String verifiedPassword;
	
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private JobPosition jobPosition;
	
	public Employee(int employeeId, String firstName, String lastName, String nationalityId, int dateOfBirth,
			String email, String jobDescription, String password, String verifiedPassword) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.jobDescription = jobDescription;
		this.password = password;
		this.verifiedPassword = verifiedPassword;
	}

}



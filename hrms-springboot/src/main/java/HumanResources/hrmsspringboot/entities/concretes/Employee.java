package HumanResources.hrmsspringboot.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "employees")
public class Employee extends User {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Size(min = 11, max = 11, message = "11 karakter olmalı")
	@NotBlank(message = "Boş olmamalı")
	@Column(name = "nationality_id")
	private String nationalityId;

	@Column(name = "date_of_birth")
	private int dateOfBirth;

	@Column(name = "job_description")
	private String jobDescription;

}

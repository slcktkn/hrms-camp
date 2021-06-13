
package HumanResources.hrmsspringboot.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "resumes")
@AllArgsConstructor
@NoArgsConstructor
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne(targetEntity = Employee.class)
	@JoinColumn(name = "employee_id", referencedColumnName = "id", nullable = false)
	private Employee employee;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linkedin_link")
	private String linkedinLink;

	@Column(name = "photo_link")
	private String photoLink;

	@Column(name = "description")
	private String description;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "is_active")
	private boolean isActive;

	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Language> languages;

	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Technology> technologies;

	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<Education> educations;

	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
	private List<JobExperience> jobExperiences;

}

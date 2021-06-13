package HumanResources.hrmsspringboot.entities.dtos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import HumanResources.hrmsspringboot.entities.concretes.Education;
import HumanResources.hrmsspringboot.entities.concretes.JobExperience;
import HumanResources.hrmsspringboot.entities.concretes.Language;
import HumanResources.hrmsspringboot.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeGetDto {

	@JsonProperty(access = Access.READ_ONLY)
	private int id;
	private int employeeId;
	private String employeeLastName;
	private String linkedInLink;
	private String githubLink;
	private String photoUrl;
	private String description;
	private Date createdDate;
	private Date updatedDate;
	private List<JobExperience> jobExperiences;
	private List<Language> languages;
	private List<Technology> technologies;
	private List<Education> education;

}

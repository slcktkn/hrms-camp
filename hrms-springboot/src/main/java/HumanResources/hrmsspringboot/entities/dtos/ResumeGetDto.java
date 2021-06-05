package HumanResources.hrmsspringboot.entities.dtos;

import java.util.List;

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
	private int id;
	private int jobSeekerId;
	private String linkedInLink;
	private String githubLink;
	private String photoUrl;
	private String description;
	private List<JobExperience> jobExperiences;
	private List<Language> languages;
	private List<Technology> technologies;
	private List<Education> education;

}

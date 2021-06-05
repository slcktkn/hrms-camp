package HumanResources.hrmsspringboot.entities.dtos;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeDto {
	
	@JsonIgnore
	private int id;
	private int employer_id;
	private String githubLink;
	private String linkedinLink;
	private String photo;
	private String description;
	private Date createdDate;
	private Date updatedDate;
		
	}
	

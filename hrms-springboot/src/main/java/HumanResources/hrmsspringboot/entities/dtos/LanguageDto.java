package HumanResources.hrmsspringboot.entities.dtos;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto {
	
	@JsonIgnore
	private int id;
	
	private int resumeId;

	private String language;

	private char langLevel;

	private Date createdDate;
	
	private boolean resumeIsActive;
	
	private String resumeJobDescription;
	
}

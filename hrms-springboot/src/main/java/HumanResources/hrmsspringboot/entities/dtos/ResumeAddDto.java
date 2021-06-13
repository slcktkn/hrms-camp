package HumanResources.hrmsspringboot.entities.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeAddDto {
	@JsonProperty(access = Access.READ_ONLY)
	private int id;
	private int jobSeekerId;
	private String linkedInLink;
	private String githubLink;
	private String photoUrl;
	private String description;

}

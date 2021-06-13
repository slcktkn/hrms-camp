package HumanResources.hrmsspringboot.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto {

	private int resumeId;

	private String language;

	private int langLevel;

	private Date createdDate;

}

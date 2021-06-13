package HumanResources.hrmsspringboot.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeWithFilteredLanguageDto {

	private int id;

	private String language;

	private char langLevel;

	private Date createdDate;

}

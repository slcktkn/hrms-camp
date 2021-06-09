package HumanResources.hrmsspringboot.entities.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementAddDto {

	@JsonIgnore
	private int id;

	private int employerId;

	private int jobPositionId;

	private int cityId;

	private String positionDescription;

	private double minSalary;

	private double maxSalary;

	private int openPositionNumber;

	private Date lastApplyDate;

	private boolean isActive = true;

}

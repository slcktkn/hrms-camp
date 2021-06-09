package HumanResources.hrmsspringboot.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "position_description")
	private String positionDescription;

	@Column(name = "min_salary")
	private double minSalary;

	@Column(name = "max_salary")
	private double maxSalary;

	@Column(name = "open_position_number")
	private int openPositionNumber;

	@Column(name = "last_apply_date")
	private Date lastApplyDate;

	@Column(name = "is_active")
	private boolean isActive = true;

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = City.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
	private City city;

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = Employer.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "employer_id", referencedColumnName = "user_id", nullable = false)
	private Employer employer;

	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = JobPosition.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "job_position_id", referencedColumnName = "id", nullable = false)
	private JobPosition jobPosition;

}

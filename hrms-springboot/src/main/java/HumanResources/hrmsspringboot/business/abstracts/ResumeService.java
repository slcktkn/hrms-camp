package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.dtos.ResumeAddDto;
import HumanResources.hrmsspringboot.entities.dtos.ResumeGetDto;

public interface ResumeService {

	Result add(ResumeAddDto resume);

	DataResult<List<ResumeGetDto>> getAll();

	// DataResult<List<ResumeGetDto>> getAllByEmployeeId(int employeeId);

	Result saveImage(MultipartFile file, int resumeId);

}

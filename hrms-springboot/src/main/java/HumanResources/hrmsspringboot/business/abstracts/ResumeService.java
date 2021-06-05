package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Resume;

public interface ResumeService {
	
	Result add (Resume resume);
	
	DataResult<List<Resume>> getAll();
	
	Result saveImage (MultipartFile file,int resumeId);
	

}

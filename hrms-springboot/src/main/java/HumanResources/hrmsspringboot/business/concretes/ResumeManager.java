package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import HumanResources.hrmsspringboot.business.abstracts.CloudinaryService;
import HumanResources.hrmsspringboot.business.abstracts.ResumeService;
import HumanResources.hrmsspringboot.core.utilities.dtoConverter.abstracts.DtoConverterService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.ResumeDao;
import HumanResources.hrmsspringboot.entities.concretes.Resume;
import HumanResources.hrmsspringboot.entities.dtos.ResumeAddDto;
import HumanResources.hrmsspringboot.entities.dtos.ResumeGetDto;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	private CloudinaryService cloudinaryService;
	private DtoConverterService dtoConverterService;

	@Autowired
	public ResumeManager(ResumeDao resumeDao, CloudinaryService cloudinaryService,
			DtoConverterService dtoConverterService) {
		super();
		this.resumeDao = resumeDao;
		this.cloudinaryService = cloudinaryService;
		this.dtoConverterService = dtoConverterService;

	}

	@Override
	public Result add(ResumeAddDto resume) {

		/*
		 * if (resume.getLanguages() != null) { resume.getLanguages().forEach(lang ->
		 * lang.setResume(resume)); }
		 * 
		 * if (resume.getTechnologies() != null) { resume.getLanguages().forEach(lang ->
		 * lang.setResume(resume)); }
		 */
		resumeDao.save((Resume) dtoConverterService.dtoClassConverter(resume, Resume.class));
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public DataResult<List<ResumeGetDto>> getAll() {

		return new SuccessDataResult<List<ResumeGetDto>>(
				dtoConverterService.dtoConverter(resumeDao.findAll(), ResumeGetDto.class), "Liste başarılı getirildi");
	}

	@Override
	public Result saveImage(MultipartFile file, int resumeId) {

		Map<String, String> uploader = (Map<String, String>) cloudinaryService.save(file).getData();
		String imageUrl = uploader.get("url");
		Resume Cv = resumeDao.getById(resumeId);

		Cv.setPhotoLink(imageUrl);
		resumeDao.save(Cv);
		return new SuccessResult("Kayıt Başarılı");

	}

	/*
	 * @Override public DataResult<List<ResumeGetDto>> getAllByEmployeeId(int
	 * employeeId) { return new
	 * SuccessDataResult<List<ResumeGetDto>>(dtoConverterService.dtoConverter
	 * (resumeDao.getAllByEmployeeId(employeeId),ResumeGetDto.class)
	 * ,"Kayıt getirildi"); }
	 */

}

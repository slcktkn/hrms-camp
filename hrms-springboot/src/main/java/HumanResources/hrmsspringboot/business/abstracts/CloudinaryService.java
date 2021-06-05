package HumanResources.hrmsspringboot.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;

public interface CloudinaryService {

	DataResult<?> save (MultipartFile file);
}

package HumanResources.hrmsspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;

import com.cloudinary.Cloudinary;

import HumanResources.hrmsspringboot.business.abstracts.CloudinaryService;
import HumanResources.hrmsspringboot.business.concretes.CloudinaryManager;

@Configuration
public class CloudinaryConfig {

	@Value("${cld.access-key}")
	String apiKey;

	@Value("${cld.secret-key}")
	String apiSecretKey;

	@Bean
	public Cloudinary cloudinaryUser() {
		return new Cloudinary(ObjectUtils.asMap("cloud_name", "tselcuk", "api_key", "api_key", "api_secret",
				"pi_secret", "secure", true));
	}

	@Bean
	public CloudinaryService cloudinaryService() {
		return new CloudinaryManager(cloudinaryUser());
	}

}

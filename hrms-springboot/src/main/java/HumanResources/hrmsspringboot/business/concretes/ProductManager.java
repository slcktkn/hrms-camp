package HumanResources.hrmsspringboot.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResources.hrmsspringboot.business.abstracts.ProductService;
import HumanResources.hrmsspringboot.core.utilities.dtoConverter.abstracts.DtoConverterService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.ErrorResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessDataResult;
import HumanResources.hrmsspringboot.core.utilities.results.SuccessResult;
import HumanResources.hrmsspringboot.dataAccess.abstracts.ProductDao;
import HumanResources.hrmsspringboot.entities.concretes.Product;
import HumanResources.hrmsspringboot.entities.dtos.ProductDto;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	private DtoConverterService dtoConverterService;

	@Autowired
	public ProductManager(ProductDao productDao,DtoConverterService dtoConverterService) {
		super();
		this.productDao = productDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(productDao.findAll(),"");
	}

	@Override
	public Result add(Product product) {
		
		if (product.getUnitPrice()==product.getUnitPrice1()) {
			System.out.println("metod calıstı");
			productDao.save(product);
		return new SuccessResult();
		}
		return new ErrorResult("olmadı");

	}

	@Override
	public DataResult<List<Product>> findByProductName(String productName) {
		
		return new SuccessDataResult<List<Product>>(productDao.findByProductName(productName));
	}

	@Override
	public DataResult<List<ProductDto>> findAllByCategoryIdOrderByUnitPriceDesc(int id) {
		List<Product> product = productDao.findAllByCategoryIdOrderByUnitPriceDesc(id);
		return new SuccessDataResult<List<ProductDto>>(dtoConverterService.dtoConverter(product, ProductDto.class), "Dto çekildi");
	}

}

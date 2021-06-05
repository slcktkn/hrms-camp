package HumanResources.hrmsspringboot.business.abstracts;

import java.util.List;

import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Product;
import HumanResources.hrmsspringboot.entities.dtos.ProductDto;

public interface ProductService {
	
	DataResult<List<Product>> getAll();
	
	Result add (Product product);
	
	DataResult<List<Product>> findByProductName(String productName);
	
	DataResult<List<ProductDto>>findAllByCategoryIdOrderByUnitPriceDesc(int id);

}

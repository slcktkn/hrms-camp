package HumanResources.hrmsspringboot.api.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HumanResources.hrmsspringboot.business.abstracts.ProductService;
import HumanResources.hrmsspringboot.core.utilities.results.DataResult;
import HumanResources.hrmsspringboot.core.utilities.results.Result;
import HumanResources.hrmsspringboot.entities.concretes.Product;
import HumanResources.hrmsspringboot.entities.dtos.ProductDto;

@RestController
@RequestMapping(name = "/api/products")
public class ProductsController {
	
	private ProductService productService;

	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProductDto product) {
		
		return productService.add(product);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return productService.getAll();
		
	}
	
	@GetMapping("/getAllByIdOrderByIdDesc")
	public DataResult<List<Product>> findByName(@RequestParam String productName){		
		return productService.findByProductName(productName);
	}
	
	@GetMapping("/getDetails")
	public DataResult<List<ProductDto>> findAllByCategoryIdOrderByUnitPriceDesc(@RequestParam int id) {
		return productService.findAllByCategoryIdOrderByUnitPriceDesc(id);
		
	}

}

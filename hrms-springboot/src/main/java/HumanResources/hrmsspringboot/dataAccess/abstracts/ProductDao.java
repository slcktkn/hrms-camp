package HumanResources.hrmsspringboot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResources.hrmsspringboot.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product> findByProductName(String productName);

	List<Product> findAllByCategoryIdOrderByUnitPriceDesc(int id);

}

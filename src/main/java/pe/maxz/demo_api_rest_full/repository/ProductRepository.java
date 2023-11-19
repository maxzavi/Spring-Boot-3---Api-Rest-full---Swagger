package pe.maxz.demo_api_rest_full.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import pe.maxz.demo_api_rest_full.entity.Product;

@RepositoryRestController
@Tag(name = "Product", description = "Product End Point")

public interface ProductRepository  extends CrudRepository<Product, Long>{
    
}
  
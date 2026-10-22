package mundia.amine.pratique_2_orm.web;

import mundia.amine.pratique_2_orm.entities.Product;
import mundia.amine.pratique_2_orm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable  Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("No Product with this id"));
    }
}

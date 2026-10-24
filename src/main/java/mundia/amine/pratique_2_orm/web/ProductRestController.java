package mundia.amine.pratique_2_orm.web;

import mundia.amine.pratique_2_orm.entities.Product;
import mundia.amine.pratique_2_orm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find/products")
    public List<Product> findProducts(String kw) {
        return productRepository.findByNameContains(kw);
    }

    @PostMapping("/products")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable  Long id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/products/{id}")
    public Product updateById(@PathVariable Long id, @RequestBody Product product) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("no such product with this id"));

        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());

        return productRepository.save(existingProduct);
    }
}

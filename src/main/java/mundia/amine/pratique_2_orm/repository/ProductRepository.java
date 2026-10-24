package mundia.amine.pratique_2_orm.repository;

import mundia.amine.pratique_2_orm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String kw);
}

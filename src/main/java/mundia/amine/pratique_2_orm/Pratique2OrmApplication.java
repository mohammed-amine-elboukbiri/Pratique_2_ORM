package mundia.amine.pratique_2_orm;

import mundia.amine.pratique_2_orm.entities.Product;
import mundia.amine.pratique_2_orm.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Pratique2OrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pratique2OrmApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            //ajout des donnée en utilisant le constructeur sans parametre
            Product p1 = new Product();
            p1.setName("Computer");
            p1.setPrice(3000);
            p1.setQuantity(5);
            //ajout des donnée en utilisant le constructeur avec parametre
            Product p2 = new Product(null,"Printer",2000,10);
            //ajout des donnée en utilisant l'annotation builder
            Product p3 = Product.builder().name("smart phone").price(4000).quantity(20).build();
            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);
            List<Product> products = productRepository.findAll();
            products.forEach(p->{
                System.out.println(p.toString());
            });
        };
    }
}

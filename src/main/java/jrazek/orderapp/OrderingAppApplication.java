package jrazek.orderapp;

import jrazek.orderapp.model.Product;
import jrazek.orderapp.repository.ProductRepository;
import jrazek.orderapp.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Controller
public class OrderingAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(OrderingAppApplication.class, args);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        UserRepository userRepository = context.getBean(UserRepository.class);
    }

}

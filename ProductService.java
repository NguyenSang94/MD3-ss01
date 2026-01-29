package ss01_gioi1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private List<Product> products = List.of(
            new Product(1, "iPhone", 1000),
            new Product(2, "Samsung", 900),
            new Product(3, "Xiaomi", 700)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}

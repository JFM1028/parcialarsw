package escuelaing.edu.co.parcialarsw.service;

import escuelaing.edu.co.parcialarsw.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Product addProduct(String nombre, double precio) {
        Product product = new Product(nombre, precio);
        products.add(product);
        return product;
    }

    public Product addProduct(Product product) {
        Product newProduct = new Product(product.getNombre(), product.getPrecio());
        products.add(newProduct);
        return newProduct;
    }
}

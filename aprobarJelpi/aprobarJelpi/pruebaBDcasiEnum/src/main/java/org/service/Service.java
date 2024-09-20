package org.service;
import org.acme.User;
import org.acme.Products;

import java.util.Optional;

import org.acme.Pedidos;
import org.acme.ProductEnum;
import org.acme.repository.ProductsRepository;
import org.acme.repository.UserRepository;
import org.acme.repository.PedidosRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;

@ApplicationScoped
public class Service {

    @Inject
    UserRepository userRepository;

    @Inject
    ProductsRepository productsRepository;

    @Inject
    PedidosRepository pedidosRepository;

    @Transactional
    public void addUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.persist(user);
    }

    @Transactional
    public void addProducts(String name, double price) {
        ProductEnum productEnum = getProductEnumByName(name);
        if (productEnum != null) {
            // Crea un nuevo objeto Products y guárdalo en el repositorio
            Products product = new Products();
            product.setName(productEnum.getName());
            product.setPrice(productEnum.getPrice());
            productsRepository.persist(product);
        }
    }

    // Método para buscar un ProductEnum por su nombre
    private ProductEnum getProductEnumByName(String name) {
        for (ProductEnum productEnum : ProductEnum.values()) {
            if (productEnum.getName().equalsIgnoreCase(name)) {
                return productEnum;
            }
        }
        return null; // Si no se encuentra el producto
    }

    @Transactional
    public Pedidos addPedidos(String user_name, String products_name) {
        Pedidos pedido = null;
        Optional<User> user = userRepository.findByIdOptional(user_name);
        Optional<Products> product = productsRepository.findByIdOptional(products_name);
        if (user.isPresent() && product.isPresent()) {
            pedido = new Pedidos(user.get(), product.get());
            pedidosRepository.persist(pedido);
        }
        return pedido;
    }

    
}

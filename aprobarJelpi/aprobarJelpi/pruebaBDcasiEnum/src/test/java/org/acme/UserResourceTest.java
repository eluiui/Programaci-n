package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.acme.repository.PedidosRepository;
import org.acme.repository.ProductsRepository;
import org.acme.repository.UserRepository;

@QuarkusTest
public class UserResourceTest {

    @Inject
    UserRepository userRepository;

    @Inject
    ProductsRepository productRepository;

    @Inject
    PedidosRepository pedidoRepository;

    @Test
    @Transactional
    public void testCreateUser() {

        User persistedUser1 = userRepository.find("name", "Pepe").firstResult();
        Assertions.assertNotNull(persistedUser1);
        Assertions.assertEquals("pepe1@example.com", persistedUser1.getEmail());

        User persistedUser2 = userRepository.find("name", "Rosa").firstResult();
        Assertions.assertNotNull(persistedUser2);
        Assertions.assertEquals("rosita@example.com", persistedUser2.getEmail());
    }

    @Test
    @Transactional
    public void testCreateProducto() {

        // Verificar que los productos se han insertado correctamente
        List<Products> products = productRepository.listAll();
        Assertions.assertEquals(ProductEnum.values().length, products.size());

        for (ProductEnum productEnum : ProductEnum.values()) {
            Products product = productRepository.find("name", productEnum.getName()).firstResult();
            Assertions.assertNotNull(product);
            Assertions.assertEquals(productEnum.getPrice(), product.getPrice());
        }
    }

    @Test
    @Transactional
    public void testCreatePedido(){
        List<Pedidos> pedidos = pedidoRepository.listAll();
        Assertions.assertEquals(2, pedidos.size());

        Pedidos pepePedido = pedidoRepository.find("ordUser", "Pepe").firstResult();
        Assertions.assertNotNull(pepePedido);
        Assertions.assertEquals("maiz", pepePedido.getProduct());

        Pedidos rosaPedido = pedidoRepository.find("ordUser", "Rosa").firstResult();
        Assertions.assertNotNull(rosaPedido);
        Assertions.assertEquals("nueces", rosaPedido.getProduct());
    }
}

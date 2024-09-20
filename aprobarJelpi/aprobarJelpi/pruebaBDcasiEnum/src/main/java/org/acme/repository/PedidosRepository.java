package org.acme.repository;
import java.util.List;
import java.util.stream.Collectors;

import org.acme.Pedidos;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidosRepository implements PanacheRepository<Pedidos> {

    public List<Pedidos> findByUserName(String user_name) {
        List<Pedidos> pedidos = this.listAll()
										.stream()
										.filter(o -> o.getUser().getName().equalsIgnoreCase(user_name))
										.collect(Collectors.toList());
		return pedidos.isEmpty()? List.of(): pedidos;
    }
}

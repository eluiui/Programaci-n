package org.acme.controller;
import org.acme.Pedidos;
import org.acme.repository.PedidosRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/pedidos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class PedidosController {

    @Inject
    PedidosRepository pedidosRepository;

    @GET
    public List<Pedidos> getAllPedidos() {
        return pedidosRepository.listAll();
    }

    @POST
    public void createPedido(Pedidos pedido) {
        pedidosRepository.persist(pedido);
    }

    @PUT
    @Path("/{id}")
    public void updatePedido(@PathParam("id") Long id, Pedidos pedido) {
        Pedidos existingPedido = pedidosRepository.findById(id);
        if (existingPedido != null) {
            existingPedido.setUser(pedido.getUser());
            existingPedido.setProduct(pedido.getProduct());
            pedidosRepository.persist(existingPedido);
        }
    }

    @DELETE
    @Path("/{id}")
    public void deletePedido(@PathParam("id") Long id) {
        Pedidos existingPedido = pedidosRepository.findById(id);
        if (existingPedido != null) {
            pedidosRepository.delete(existingPedido);
        }
    }
}

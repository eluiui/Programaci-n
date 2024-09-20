package org.acme.controller;
import org.acme.Products;
import org.acme.repository.ProductsRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ProductsController {

    @Inject
    ProductsRepository productsRepository;

    @GET
    public List<Products> getAllProducts() {
        return productsRepository.listAll();
    }

    @POST
    public void createProduct(Products product) {
        productsRepository.persist(product);
    }

    @PUT
    @Path("/{name}")
    public void updateProducts(@PathParam("name") String name, double price) {
        Products existingProduct = productsRepository.find("name", name).firstResult();
        if (existingProduct != null) {
            existingProduct.setName(name);
            existingProduct.setPrice(price);
            productsRepository.persist(existingProduct);
        }
    }

    @DELETE
    @Path("/{name}")
    public void deleteProduct(@PathParam("name") String name) {
        Products existingProduct = productsRepository.find("name", name).firstResult();
        if (existingProduct != null) {
            productsRepository.delete(existingProduct);
        }
    }
}

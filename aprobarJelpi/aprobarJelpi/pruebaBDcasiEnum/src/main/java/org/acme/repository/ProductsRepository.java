package org.acme.repository;
import jakarta.enterprise.context.ApplicationScoped;

import org.acme.Products;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class ProductsRepository implements PanacheRepositoryBase<Products, String>{

}

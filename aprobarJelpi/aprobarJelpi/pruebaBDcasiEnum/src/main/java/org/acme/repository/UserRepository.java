package org.acme.repository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.User;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User,String> {
}

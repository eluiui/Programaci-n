package org.acme.controller;
import org.acme.User;
import org.acme.repository.UserRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserRepository userRepository;

    @GET
    public List<User> getAllUsers() {
        return userRepository.listAll();
    }

    @GET
    @Path("/{name}")
    public User getUserById(@PathParam("name") String name) {
        return userRepository.findById(name);
    }

    @POST
    public void createUser(User user) {
        userRepository.persist(user);
    }

    @PUT
    @Path("/{name}")
    public void updateUser(@PathParam("name") String name, User user) {
        User existingUser = userRepository.findById(name);
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            userRepository.persist(existingUser);
        }
    }

    @DELETE
    @Path("/{name}")
    public void deleteUser(@PathParam("name") String name) {
        User existingUser = userRepository.findById(name);
        if (existingUser != null) {
            userRepository.delete(existingUser);
        }
    }
}
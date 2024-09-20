package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.acme.repository.UserRepository;

@QuarkusTest
public class UserResourceTest {

    @Inject
    UserRepository userRepository;

    @Test
    @Transactional
    public void testCreateUser() {
        // Crea un nuevo usuario
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        userRepository.persist(user);

        // Verifica que el usuario se haya creado correctamente
        given()
          .when().get("/users/" + user.getId())
          .then()
             .statusCode(200)
             .body("name", is("John Doe"))
             .body("email", is("john.doe@example.com"));
    }
}

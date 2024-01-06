package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User user;
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        user = new User("user", "password");
        userRepository = new UserRepository();
    }

    @Test
    void positiveUserData() {

        assertTrue(user.login("user", "password"));
    }

    @ParameterizedTest
    @CsvSource({"root, 1234", "root, password", "user, 1234"})
    void negativeCredentials(String name, String password) {
        assertFalse(user.login(name, password));
    }

    @Test
    void positiveDataForUserRepository() {
        user.login(user.name, user.password);
        userRepository.addUser(user);
        assertTrue(userRepository.findByName("user"));
    }

    @Test
    void negativeDataForUserRepository() {
        User newUser = new User("ivan", "1111");
        userRepository.addUser(newUser);
        assertFalse(userRepository.findByName("ivan"));
    }
}


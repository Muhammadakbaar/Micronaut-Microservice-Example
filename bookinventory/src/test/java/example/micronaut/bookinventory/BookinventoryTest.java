package example.micronaut.bookinventory;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
public class BookinventoryTest {

    @Inject
    EmbeddedApplication application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

}

package ariefbelajarjava.reflection;

import ariefbelajarjava.reflection.data.Person;
import ariefbelajarjava.reflection.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {

        Person person = new Person("Hilmi", " ");
        Validator.validateNotBlank(person);

    }
}

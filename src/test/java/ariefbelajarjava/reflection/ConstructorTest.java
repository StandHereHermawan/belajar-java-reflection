package ariefbelajarjava.reflection;

import ariefbelajarjava.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {

    @Test
    void testConstructor() {

        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
            System.out.println("=================");
     
        }
        
    }

    @Test
    void testCreateObjectUsingConstructor() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor();
        Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class);

        Person person1 = constructor.newInstance();
        Person person2 = constructorParameters.newInstance("Hilmi", "Akbar");

        System.out.println(person1);
        System.out.println(person2);
    }
}

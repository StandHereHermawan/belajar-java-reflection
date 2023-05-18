package ariefbelajarjava.reflection;

import ariefbelajarjava.reflection.data.NameAble;
import ariefbelajarjava.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InterfaceTest {

    @Test
    void testClass() {

        Class<NameAble> nameAbleClass = NameAble.class;

        System.out.println(nameAbleClass.getName());
        System.out.println(nameAbleClass.isInterface());
        System.out.println(nameAbleClass.getSuperclass());
        System.out.println(Arrays.toString(nameAbleClass.getInterfaces()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredFields()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredConstructors()));

    }

    @Test
    void testSuperInterfaces() {

        Class<Person> personClass = Person.class;

        System.out.println(Arrays.toString(personClass.getInterfaces()));

    }
}

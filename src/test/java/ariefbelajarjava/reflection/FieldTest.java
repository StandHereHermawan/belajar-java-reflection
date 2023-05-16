package ariefbelajarjava.reflection;

import ariefbelajarjava.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {

    @Test
    void testGetFields() {

        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+" : "+field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws IllegalAccessException, NoSuchFieldException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Arief", "Karditya");
        String result = (String) firstName.get(person1);
        System.out.println(result);

        Person person2 = new Person("Hilmi", "Muharrom");
        String result2 = (String) firstName.get(person2);
        System.out.println(result2);

    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Hermawan", "Karditya");
        firstName.set(person1,"Arief"); //person1.setFirstName("Arief");
        System.out.println(person1.getFirstName());

        Person person2 = new Person("AKbar", "Muharrom");
        firstName.set(person2, "Hilmi"); //person2.setFirstName("Hilmi");
        System.out.println(person2.getFirstName());

    }
}

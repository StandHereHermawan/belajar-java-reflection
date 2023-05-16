package ariefbelajarjava.reflection;

import ariefbelajarjava.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {

    @Test
    void testGetMethod() {

        Class<Person> personClass = Person.class;

        Method[] Methods = personClass.getDeclaredMethods();
        for (Method method : Methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println("===================");
        }

    }

    @Test
    void testGetMethodValue() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        Class<Person> personClass = Person.class;
        Method getFirstName = personClass.getDeclaredMethod("getFirstName");

        Person person1 = new Person("Quang", "Dale");
        String firstName = (String) getFirstName.invoke(person1);
        System.out.println(firstName);

    }
}

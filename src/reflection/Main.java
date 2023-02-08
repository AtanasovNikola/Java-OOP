package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;


        Arrays.stream(clazz.getDeclaredFields()).
                filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.printf("%s must be private!%n", f.getName()));

        Method[] methods = clazz.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(method -> method.getReturnType() != void.class)
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s must be public!%n", m.getName()));

        Arrays.stream(methods)
                .filter(method -> method.getReturnType() == void.class)
                .filter(method -> !Modifier.isPrivate(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s must be private!%n",m.getName()));

        Arrays.stream(methods).filter( m -> m.getAnnotation(Author.class) != null)
                .map(m-> m.getAnnotation(Author.class))
                .forEach( m -> System.out.println(m.name()));

    }

}


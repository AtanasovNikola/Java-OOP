package reflection.lab;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class MethodsExample {
    private static class MethodComparator implements Comparator<Method> {


        @Override
        public int compare(Method f, Method s) {
            boolean firstIsGetter = f.getName().contains("get");
            boolean secondIsGetter = s.getName().contains("get");

            if (firstIsGetter && secondIsGetter) {
                return f.getName().compareTo(s.getName());
            }

            boolean firstIsSetter = f.getName().contains("set");
            boolean secondIsSetter = s.getName().contains("set");

            if (firstIsSetter && secondIsSetter) {
                return f.getName().compareTo(s.getName());
            }

            return Boolean.compare(secondIsGetter, firstIsGetter);
        }

    }

    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(m -> !m.getName().equals("toString"))
                .sorted(new MethodComparator())
                .forEach(MethodsExample::printMethod);
    }


    public static void printMethod(Method method) {
        System.out.println(method.getName().startsWith("get")
                ? String.format("%s will return class %s", method.getName(), method.getReturnType().getSimpleName())
                : String.format("%s and will set field of class %s", method.getName(), method.getParameterTypes()[0].getSimpleName()));
    }
}

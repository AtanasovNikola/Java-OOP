package reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = blackBoxIntClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        BlackBoxInt blackBoxInt = constructor.newInstance();

        String command = scanner.nextLine();

        Field innerValue = blackBoxIntClass.getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        while (!command.equals("END")) {

            String[] methodData = command.split("_");

            String methodName = methodData[0];
            int methodValue = Integer.parseInt(methodData[1]);

            Method method = blackBoxIntClass.getDeclaredMethod(methodName, int.class);

            method.setAccessible(true);
            method.invoke(blackBoxInt, methodValue);

            System.out.println(innerValue.get(blackBoxInt));

            command = scanner.nextLine();
        }
    }
}

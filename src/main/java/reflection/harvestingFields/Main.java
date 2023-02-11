package reflection.harvestingFields;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Scanner scanner = new Scanner(System.in);

        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
        Constructor<RichSoilLand> declaredConstructor = richSoilLandClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Field[] fields = richSoilLandClass.getDeclaredFields();

        String command = scanner.nextLine();

        while (!command.equals("HARVEST")) {

            switch (command) {
                case "private" -> Arrays.stream(fields).filter(f -> Modifier.isPrivate(f.getModifiers())).forEach(Main::print);
                case "protected" -> Arrays.stream(fields).filter(f -> Modifier.isProtected(f.getModifiers())).forEach(Main::print);
                case "public" -> Arrays.stream(fields).filter(f -> Modifier.isPublic(f.getModifiers())).forEach(Main::print);
                case "all" -> Arrays.stream(fields).forEach(Main::print);
            }

            command = scanner.nextLine();
        }
    }

    public static void print(Field field) {
        System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
    }
}

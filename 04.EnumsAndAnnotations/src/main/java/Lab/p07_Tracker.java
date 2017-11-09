package Lab;

import java.lang.reflect.Method;

public class p07_Tracker {

    @p07_Author(name = "Ivan Ivanov")
    public static void printMethodsByAuthor(Class<?> cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method met : methods) {
            p07_Author author = (p07_Author) met.getAnnotation(p07_Author.class);
            System.out.println(String.format("%s: %s()", author.name(), met.getName()));
        }
    }

    @p07_Author(name = "Ivan")
    public static void main(String[] args) {
        printMethodsByAuthor(p07_Tracker.class);

    }

}




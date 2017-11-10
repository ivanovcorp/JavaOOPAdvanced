package Lab;

import java.util.Arrays;

public class p01_Reflection {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class cl = Reflection.class;

        System.out.println(cl);
        System.out.println(cl.getSuperclass());
        Class[] interfaces = cl.getInterfaces();
        Arrays.asList(interfaces).stream().forEach(System.out::println);
        Reflection inst = (Reflection)cl.newInstance();
        System.out.println(inst);

    }
}




/*
 * p02_GettersAndSetters.java
 *
 * created at 2017-11-10 by iv.ivanov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package Lab;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p02_GettersAndSetters
{

    public static void main(String[] args)
    {
        Class cl = Reflection.class;
        Method[] methods = cl.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();

        getters = Arrays.asList(methods).stream().filter(x -> x.getName().startsWith("get")).collect(Collectors.toList());
        getters.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
        getters.forEach(System.out::println);

        System.out.println();

        List<Method> setters = new ArrayList<>();

        setters = Arrays.asList(methods).stream().filter(x -> x.getName().startsWith("set")).collect(Collectors.toList());
        setters.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
        setters.forEach(System.out::println);

    }

}




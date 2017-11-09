package Exercise;

import java.lang.annotation.Annotation;

public class p04_TestAnnotation {

    public static void main(String[] args) throws ClassNotFoundException {

        String input = "Suit";

        if (input.equals("Rank")) {
             Class cl = p03_RankPower.class;
             p04_EnumAnnotation annotation = (p04_EnumAnnotation) cl.getAnnotation(p04_EnumAnnotation.class);
             System.out.println(String.format("Type = Enumeration, Description = %s", annotation.description()));
        } else if (input.equals("Suit")) {
            Class cl = p03_SuitPower.class;
            p04_EnumAnnotation annotation = (p04_EnumAnnotation) cl.getAnnotation(p04_EnumAnnotation.class);
            System.out.println(String.format("Type = Enumeration, Description = %s", annotation.description()));
        }


    }

}




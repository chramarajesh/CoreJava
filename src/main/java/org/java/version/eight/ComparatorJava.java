package org.java.version.eight;

import java.util.Comparator;

public class ComparatorJava {

    public static void main(String[] args) {
        Comparator<Integer> comparator=new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        int compare = comparator.compare(0, 3);
        System.out.println(compare);

        //Using Lambda
        Comparator<Integer> comparatorLambda=(Integer number1, Integer number2) -> number1.compareTo(number2);
        System.out.println(comparatorLambda.compare(3, 3));
    }
}

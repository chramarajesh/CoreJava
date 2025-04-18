package org.java.version.eight.lambda;

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
        Comparator<Integer> lambda=(Integer number1, Integer number2) -> number1.compareTo(number2);
        System.out.println(lambda.compare(3, 3));

        Comparator<Integer> lambdaTypeSafe=( number1,  number2) -> number1.compareTo(number2);
        System.out.println(lambdaTypeSafe.compare(3, 3));
    }
}

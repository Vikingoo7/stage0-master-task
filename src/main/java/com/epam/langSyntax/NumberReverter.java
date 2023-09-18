package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int result = number % 10 * 100;
        number/= 10;
        result += number % 10 * 10;
        number/=10;
        result += number;
        System.out.println(result);

    }
}

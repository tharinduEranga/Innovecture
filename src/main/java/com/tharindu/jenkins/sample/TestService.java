package com.tharindu.jenkins.sample;

import java.util.function.Predicate;

public class TestService {
    private static final Predicate<String> isEqualLogic = "WWW"::equals; //name -> "WWW".equals(name)

    public static void main(String[] args) {
        boolean equal = checkEqual("WWW", isEqualLogic);
        System.out.println(equal);
    }

    /**
     * @param value     value to check
     * @param condition checking logic
     * @return the output (boolean)
     */
    private static boolean checkEqual(String value, Predicate<String> condition) {
        return condition.test(value);
    }
}

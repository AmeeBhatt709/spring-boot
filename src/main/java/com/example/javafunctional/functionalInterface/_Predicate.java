package com.example.javafunctional.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("isPhoneNumberValidPredicate.test(\"0792274301\") = " + isPhoneNumberValidPredicate.test("0792274301"));

    }
    static Predicate<String> isPhoneNumberValidPredicate=phoneNumber->
            phoneNumber.startsWith("07") && phoneNumber.length()==10;

}

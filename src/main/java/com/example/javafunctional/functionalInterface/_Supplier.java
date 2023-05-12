package com.example.javafunctional.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println("print() = " + print());
        System.out.println("supplier.get() = " + supplier.get());

    }

    static String print()
    {
        return "jdbc://localhost:5432/users";
    }
    static Supplier<String> supplier=()->
            "jdbc://localhost:5432/users";

}

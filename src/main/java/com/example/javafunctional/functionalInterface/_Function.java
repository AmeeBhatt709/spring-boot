package com.example.javafunctional.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //function takes one argument and produce 1 result
        int increment =increment(1);
        System.out.println("increment = " + increment);

        Integer integer=incrementByOneFunction.apply(1);
        System.out.println("integer = " + integer);

        Function<Integer,Integer> function=incrementByOneFunction.andThen(multiplyBy10);
        System.out.println("function.apply(2) = " + function.apply(2));


           BiFunction<Integer,Integer,Integer>  incrementByOneAndMultiplyBiFunction=
                (numberToIncrement,numberToMultiply)->
                        (numberToIncrement+1)*numberToMultiply;

           System.out.println(incrementByOneAndMultiplyBiFunction.apply(20,20));
       Integer integer1= incrementByOneAndMultiplyBiFunction.apply(20,50);


    }




    static Function<Integer,Integer> incrementByOneFunction=number->number + 1;
    static Function<Integer,Integer> multiplyBy10=number-> number*10;



    static int increment(int number)
    {
        return number+1;
    }

    
}

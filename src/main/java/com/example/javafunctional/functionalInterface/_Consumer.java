package com.example.javafunctional.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
   Customer jack=new Customer(" Jack,","7201954595");
        greetCustomerConsumer.accept(jack);
        greetCustomerConsumer2.accept(jack,false);
    }


    static  void greetCustomer(Customer customer)
    {
        System.out.println( "hello" + customer.customerName + " Thanks for registering phone number " + customer.customerPhoneNumber);
    }
    static Consumer<Customer> greetCustomerConsumer=

        customer->System.out.println( "hello  " + customer.customerName + " Thanks for registering phone number " + customer.customerPhoneNumber);
    static BiConsumer<Customer,Boolean> greetCustomerConsumer2=
            (customer,showPhone)->System.out.println( "hello  " + customer.customerName + " Thanks for registering phone " +
                    "number " +(showPhone ? customer.customerPhoneNumber:"********"));


    static class Customer
    {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}

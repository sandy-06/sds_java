package com.company;

import org.junit.Test;

public class PersonTest {
    public static void main(String[] args) {
        //assertEquals(expected, actual);
        Person person = new Person("John");
        assertEquals("John", person.getName());
    }




    private static void assertEquals(String john, String name) {
    }
}
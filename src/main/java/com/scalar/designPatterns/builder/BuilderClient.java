package com.scalar.designPatterns.builder;

public class BuilderClient {

    public static void main(String[] args) {

        Student student = Student.builder()
                                 .setAge(12)
                                 .setName("Rakesh")
                                 .setBatch("Apirl24")
                                 .setPsp(24.5)
                                 .setPhone("7676543289")
                                 .build();

        System.out.println(student);
    }
}

package com.scalar.designPatterns.prototype;

import java.util.*;

public class PrototypeClient {



    public static void main(String[] args) {

        Student july12Batch = new Student();
        july12Batch.setBatch("july12Batch");
        july12Batch.setPsp(76.7);
        StudentRegistry.addStudent("july12Batch", july12Batch);
        Student july13Batch = new Student();
        july13Batch.setBatch("july13Batch");
        july13Batch.setPsp(83.8);
        StudentRegistry.addStudent("july13Batch", july13Batch);
        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("Nov22Batch");
        is.setPsp(98.8);

        StudentRegistry.addStudent("Nov22Batch", is);

        Student s1 = StudentRegistry.getStudent("july13Batch").clone();
        s1.setName("Rakesh");
        s1.setAge(23);
        s1.setPhone("9876567832");
        System.out.println(s1);

        Student s2 = StudentRegistry.getStudent("july12Batch").clone();
        s2.setName("venkatesh");
        s2.setAge(26);
        s2.setPhone("7898765444");

        Student s3 = StudentRegistry.getStudent("Nov22Batch").clone();
        s3.setName("Rakesh");
        s3.setAge(23);
        s3.setPhone("9876567832");
        System.out.println(s3);



    }


}

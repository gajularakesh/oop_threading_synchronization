package com.scalar.designPatterns.prototype.practice;

public class Client {
   public static  StudentRegistry registry = new StudentRegistry();
    public static void main(String[] args) {

        fillRegistry();

        Student rakesh = registry.getStudent("april26Batch").clone();
        System.out.println(rakesh);
        rakesh.setName("Rakesh");
        rakesh.setAge(25);

        System.out.println(rakesh);

    }

    public static void fillRegistry(){



       // String april26Batch = "april26Batch";

        Student april25Batch =  new Student();
        april25Batch.setBatchName("april25Batch");
        april25Batch.setBatchPsp("99");

        registry.registerStudent("april25Batch", april25Batch);

        Student april26Batch =  new Student();
        april26Batch.setBatchName("april26Batch");
        april26Batch.setBatchPsp("94");

        registry.registerStudent("april26Batch", april26Batch);


    }
}

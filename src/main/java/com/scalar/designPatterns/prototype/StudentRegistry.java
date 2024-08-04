package com.scalar.designPatterns.prototype;

import java.util.HashMap;

public class StudentRegistry {
  private static  HashMap<String, Student> students =  new HashMap<>();

   public StudentRegistry() {}

    public static Student getStudent(String key) {
       return students.get(key);
    }

    public static void addStudent(String key ,Student value) {
       students.put(key,value);
    }

}

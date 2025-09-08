package com.scalar.designPatterns.prototype.practice;

import java.util.*;

public class StudentRegistry {

    static Map<String,Student> studentRegistry = new HashMap<String,Student>();
    public StudentRegistry() {}

    public void registerStudent(String protoTypeName, Student student) {
        studentRegistry.put(protoTypeName, student);
    }

    public Student getStudent(String protoTypeName) {
        return studentRegistry.get(protoTypeName);
    }
}

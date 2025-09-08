package com.scalar.designPatterns.prototype.practice;

public class IntelligentStudent extends Student{

    private int iq;


    IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent iStudent) {
        super(iStudent);
        this.iq = iStudent.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }


}

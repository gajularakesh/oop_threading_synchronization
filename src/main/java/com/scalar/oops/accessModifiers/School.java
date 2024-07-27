package com.scalar.oops.accessModifiers;

public class School {
    public String group;
    protected String area;
    private int classNumber;
    int vanNumber;

    public School(){

    }
    public School(String group, String area, int classNumber, int vanNumber) {
        this.group = group;
        this.area = area;
        this.classNumber = classNumber;
        this.vanNumber = vanNumber;
    }
}

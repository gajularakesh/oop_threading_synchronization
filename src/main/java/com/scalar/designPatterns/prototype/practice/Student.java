package com.scalar.designPatterns.prototype.practice;

public class Student implements ProtoType<Student>{

    private String name;
    private int age;
    private String batchName;
    private String batchPsp;

    public Student(){}

    public Student(Student student){
        this.age = student.age;
        this.batchName = student.batchName;
        this.batchPsp = student.batchPsp;
        this.name = student.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    public void setBatchPsp(String batchPsp) {
        this.batchPsp = batchPsp;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getBatchPsp() {
        return batchPsp;
    }

    public String getName() {
        return name;
    }

    public Student clone(){
        return new Student(this); // this means calling object i.e Actual prototype
    }                             // new student is copiedobject from original one


    @Override
    public String toString(){

        return ""+this.name+" "+this.age+" "+this.batchName+" "+this.batchPsp;
    }
}

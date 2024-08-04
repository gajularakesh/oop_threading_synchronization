package com.scalar.designPatterns.prototype;

public class Student implements StudentPrototype<Student> {
    private String name;
    private int age;
    private String phone;
    private String batch;
    private double psp;
    private int count = 1;

    public Student(){}

    Student(Student student){
        this.name = student.getName();
        this.age = student.getAge();
        this.phone = student.getPhone();
        this.batch = student.getBatch();
        this.psp = student.getPsp();
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        count++;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student clone(){
        return new Student(this);
    }

    public String toString(){
        return "[ "+name + " " + age + " " + phone + " " + batch + " " + psp+" ]";
    }
}


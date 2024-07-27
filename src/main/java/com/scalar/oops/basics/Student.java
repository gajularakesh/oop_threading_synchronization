package com.scalar.oops.basics;

import com.scalar.oops.accessModifiers.School;

public class Student extends School{
   private String name;
    int age;
   protected String batch;
   public float psp;

   Student(){}

    Student(String name, int age, String batch, float psp,String group,String area,int number,int van) {
       super(group,area,number,van);
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
    }
//    public String group;
//    protected String area;
//    private int classNumber;
//    int vanNumber;
//    public void display() {
//       Student st = new Student(name, age, batch, psp);
//       //String name =  st.vanNumber;
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}

package com.scalar.oops.inhertance;

public class IntelligentStudent extends Student{

    int iq;
    public IntelligentStudent() {

    }
    public IntelligentStudent(int iq) {
        this.iq = iq;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    //to check how to access parent class variable
    public String toString() {
        return "IntelligentStudent " + iq + " "+this.getName()+" "+this.getSchool()+" "+this.getAge();
    }
}

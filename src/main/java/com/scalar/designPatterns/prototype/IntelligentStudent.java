package com.scalar.designPatterns.prototype;

public class IntelligentStudent extends Student {

    private int iq;
    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent is) {
        super(is);
        //this.iq = is.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {


        return new IntelligentStudent(this);
    }

    public String toString(){
        return "[ "+ super.getName()+" , iq: "+iq+" "+ super.getAge()+" "+ super.getPhone()+" "+super.getPsp()+" "+super.getBatch()+" ]";
    }
}

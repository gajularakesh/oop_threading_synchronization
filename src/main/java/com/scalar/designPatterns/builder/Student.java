package com.scalar.designPatterns.builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private String phone;

    //Builder : checking parameter is valid or not before creating object;
    private Student(Builder builder){

        if(builder.age > 100){//exmaple age if age is >100 will exception
            throw new IllegalArgumentException("Age must be less than 100");
        }
        this.name = builder.name;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    static class Builder{
        private String name;
        private int age;
        private String batch;
        private double psp;
        private String phone;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public String getBatch() {
            return batch;
        }
        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public double getPsp() {
            return psp;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public String getPhone() {
            return phone;
        }
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
       return "[ "+name+" ,"+age+" ,"+batch+" ,"+psp+" ,"+phone+" ]";
    }
}


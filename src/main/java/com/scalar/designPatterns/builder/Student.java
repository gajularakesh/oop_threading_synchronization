package com.scalar.designPatterns.builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private String phone;

    //Builder : one of the use case is checking parameter is valid or not before creating object;
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
    //why I wrote Builder class here why not separate
    //what if we have 100 clasess we need to create 100 builder class which end up using huge space
    //and 1 more thing is if we create separate class client should aware of
    // builder class is there for student which is not a good practice
    //student itself build the student builder class now no one know who is its builder class
    //why static? bcz with out student object we can;t access the innerclass without static 1st student object
    // need to be created then on top it we can call or create builder things
    //if we use static we can create object for builder class with need of student object
    //now builder class is dependent of outclass directly we can create builder object using student
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


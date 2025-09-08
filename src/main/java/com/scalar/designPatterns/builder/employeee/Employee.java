package com.scalar.designPatterns.builder.employeee;

public class Employee {

    private int id;
    private String name;
    private int age;
    private double salary;

    private  Employee(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    public static Builder employeeBuilder(){
        return new Builder();
    }

    public static final class Builder{
        private int id;
        private String name;
        private int age;
        private double salary;

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder salary(double salary){
            this.salary = salary;
            return this;
        }
        public Employee build(){

            return new Employee(this);
        }


    }
    @Override
    public String toString() {
        return "Builder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

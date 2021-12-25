package com.example.classregister.Entity;




import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Grade")
    private double grade;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Age")
    private int age;


    public Student(double grade, String firstName, String lastName, int age) {


        this.grade = grade;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(){

    }

    public void setId(Integer id) {
        this.id = id;
    }





    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

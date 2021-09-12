package com.company;

public class StudentProfessorTest {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.greet();

        Student student1 = new Student();
        student1.setAge(12);
        student1.greet();
        student1.showAge();

        Professor professor = new Professor();
        professor.setAge(43);
        professor.greet();
        professor.explain();

    }
}

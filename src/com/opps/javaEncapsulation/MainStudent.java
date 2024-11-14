package com.opps.javaEncapsulation;

import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStudent_id(1);
        student.setStudent_name("Nadia Hyakinthos");

        student.addGrade(92.5);
        student.addGrade(89.0);
        student.addGrade(90.3);

        int student_id = student.getStudent_id();
        String student_name = student.getStudent_name();
        List<Double> grades = student.getGrades();

        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);
    }
}

package org.multifaceted.repository;

import org.multifaceted.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StubStudentRepositoryImpl implements StudentRepository {

    @Override
    public List<Student> findAll(){

        List<Student> studentList = new ArrayList<>();

        Student student = new Student();

        student.setFirstName("John");
        student.setLastName("Doe");

        studentList.add(student);

        return studentList;
    }
}

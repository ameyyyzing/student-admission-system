package org.multifaceted.org.multifaceted.service;

import org.multifaceted.model.Student;
import org.multifaceted.repository.StubStudentRepositoryImpl;
import org.multifaceted.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository repository = new StubStudentRepositoryImpl();
    @Override
    public List<Student> findAll(){
        return repository.findAll();
    }
}

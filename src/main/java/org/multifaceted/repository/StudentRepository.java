package org.multifaceted.repository;

import org.multifaceted.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}

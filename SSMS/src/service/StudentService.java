package service;

import model.Student;
import exception.StudentNotFoundException;

import java.util.List;

public interface StudentService {

    void addStudent(Student s);
    List<Student> getAllStudents();
    void deleteStudent(int id) throws StudentNotFoundException;
    Student searchStudentById(int id) throws StudentNotFoundException;

    // Compile-time polymorphism: method overloading
    List<Student> searchStudent(String name);
    List<Student> searchStudent(String course, float minMarks);

}

	

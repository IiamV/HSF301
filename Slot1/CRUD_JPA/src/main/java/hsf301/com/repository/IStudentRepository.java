package hsf301.com.repository;

import hsf301.com.pojo.Student;

import java.util.List;

public interface IStudentRepository {

    public void save(Student student);
    public List<Student> findAll();
    public void delete(int studentID);
    public Student findById(int studentID);
    public void update(int id, Student student);
}
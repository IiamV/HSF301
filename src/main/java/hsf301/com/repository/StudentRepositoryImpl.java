package hsf301.com.repository;

import hsf301.com.dao.StudentDAO;
import hsf301.com.pojo.Student;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private StudentDAO studentDAO = null;

    public StudentRepositoryImpl(String fileConfig) {
        studentDAO = new StudentDAO(fileConfig);
    }

    @Override
    public void save(Student student) {
        studentDAO.save(student);
    }
    @Override
    public List<Student> findAll() {
        return studentDAO.getStudents();
    }
    @Override
    public void delete(int studentID) {
        studentDAO.delete(studentID);
    }
    @Override
    public Student findById(int studentID) {
        return studentDAO.findById(studentID);
    }
    @Override
    public void update(Student student) {
        studentDAO.updateStudent(student);
    }
}
